/**
 * 
 */
package scb.dev.sms.common;

/**
 * 
 * @author 
 *
 */


public interface SupportConstant {

	
	
	public final static String ADD_SUCCESS = "1111-1";			
	public final static String ADD_FAILURE = "1111-0";
	
	public final static String UPDATE_SUCESS = "2222-1";
	public final static String UPDATE_FAILURE = "2222-0";
	
	public final static String DELETE_SUCESS = "3333-1";
	public final static String DELETE_FAILURE = "3333-0";
	
	public final static String QUERY_SUCCESS="444-1";
	public final static String QUERY_FAILURE="444-0";

	
	public final static String IMPORT_SUCCESS = "5555-1";		//从excel中导入成功，显示5555-1
	public final static String IMPORT_FAULURE = "5555-0";		//从excel中导入失败，显示5555-1
	
	public final static String EXPORT_SUCCESS = "6666-1";		//导出到excel成功，显示6666-1
	public final static String EXPORT_FAULURE = "6666-0";		//导出到excel失败，显示6666-0
	
	
	
}
