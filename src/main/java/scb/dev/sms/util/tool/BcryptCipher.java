package scb.dev.sms.util.tool;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.mindrot.jbcrypt.BCrypt;
import org.omg.CORBA.PRIVATE_MEMBER;

import scb.dev.sms.common.CommonData;

public class BcryptCipher {
	// generate salt seed
	private static final int SALT_SEED = 12;
	// the head fo salt
	private static final String SALT_STARTSWITH = "$2a$12$";
	
	public static final String SALT_KEY = "salt";
	
	public static final String CIPHER_KEY = "cipher";
	
	public static final String CHANGEPASSWORD="changePassword";	
	private  static final String Bcrypt_CHANGEPASSWORD=BCrypt.hashpw(CHANGEPASSWORD, SALT_KEY);
	
	
	
	
	//输入密码，返回加密值
	public static String  Bcrypt(final String encryptSource) {
		String salt  = BCrypt.gensalt(SALT_SEED);
		String bcryptResult = Bcrypt(salt, encryptSource);
		return bcryptResult;
	}
	//输入密码和自定义盐值，返回加密值
	public static String Bcrypt(final String salt, final String encryptSource) {
		if (StringUtils.isBlank(encryptSource)) {
			throw new RuntimeException("Bcrypt encrypt input params can not be empty");
		}
		
		if (StringUtils.isBlank(salt) || salt.length() != 29) {
			throw new RuntimeException("Salt can't be empty and length must be to 29");
		}
		if (!salt.startsWith(SALT_STARTSWITH)) {
			throw new RuntimeException("Invalid salt version, salt version is $2a$12");
		}
		
		String cipher = BCrypt.hashpw(encryptSource, salt);
		
		return cipher;
	}
	//检查原密码和加密后密文是否一致
	public static boolean checkpw(String password,String pwt) {
		
		return BCrypt.checkpw(password,pwt);
	}
	//返回map类型值，包含密文和初始时间
	public static Map<String, String> BcryptWithTime() {
		String salt  = BCrypt.gensalt(SALT_SEED);
		String encryptSource=CHANGEPASSWORD;
		String cipher = BCrypt.hashpw(encryptSource, salt);
		Map<String, String> bcryptResult = new HashMap<String, String>();
		bcryptResult.put("startTime", String.valueOf(System.currentTimeMillis()));
		bcryptResult.put(CIPHER_KEY, cipher);
		
		return bcryptResult;
	}
	
	//返回字符串，若业务执行，返回成功，若失效，返回失败
	public static String checkBussiness(String bctypt,String startTime,int time) {
		int theTime=time;
		if(theTime<0)
			theTime=0;
		String salt  = BCrypt.gensalt(SALT_SEED);
		long endTime=System.currentTimeMillis();
		String res="";
		if(endTime-Long.parseLong(startTime)<=1000*60*theTime) {
			if(Bcrypt_CHANGEPASSWORD.equals(bctypt)) {
				res=CommonData.SUCCESS;
			}else{
				res=CommonData.FAILURE;
			}
			
		}else {
			res=CommonData.FAILURE;
		}
		
		return res;
	}
	/**
	 * Bcrypt encryption algorithm method
	 * @param encryptSource 
	 * 					need to encrypt the string
	 * @return Map , two values in Map , salt and cipher
	 */
	/*public static Map<String, String> Bcrypt(final String encryptSource) {
		String salt  = BCrypt.gensalt(SALT_SEED);
		Map<String, String> bcryptResult = Bcrypt(salt, encryptSource);
		return bcryptResult;
	}*/
	/**
	 * 
	 * @param salt encrypt salt, Must conform to the rules 
	 * @param encryptSource
	 * @return
	 */
	/*public static Map<String, String> Bcrypt(final String salt, final String encryptSource) {
		if (StringUtils.isBlank(encryptSource)) {
			throw new RuntimeException("Bcrypt encrypt input params can not be empty");
		}
		
		if (StringUtils.isBlank(salt) || salt.length() != 29) {
			throw new RuntimeException("Salt can't be empty and length must be to 29");
		}
		if (!salt.startsWith(SALT_STARTSWITH)) {
			throw new RuntimeException("Invalid salt version, salt version is $2a$12");
		}
		
		String cipher = BCrypt.hashpw(encryptSource, salt);
		Map<String, String> bcryptResult = new HashMap<String, String>();
		bcryptResult.put(SALT_KEY, salt);
		bcryptResult.put(CIPHER_KEY, cipher);
		
		return bcryptResult;
	}*/
}

