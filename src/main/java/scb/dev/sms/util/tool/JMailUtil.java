/**
 * Project Name:scb.sms
 * File Name:JMailUtil.java
 * Package Name:scb.dev.sms.util.tool
 * Date:2018年11月14日下午2:48:21
 *
 */
package scb.dev.sms.util.tool;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import scb.dev.sms.common.CommonEmailType;

/**
 * ClassName: JMailUtil <br/>
 * Description: JMailUtil. <br/>
 * date: 2018年11月14日 下午2:48:21 <br/>
 *
 * @author Zither_Chen
 * @version V1.0
 * @since JDK 1.8
 */
public class JMailUtil {
	private static final Logger logger = Logger.getLogger(JMailUtil.class);

	public static void sendMail(String[] to, String[] cc, String[] bcc, String subject, String content) {
//		String host = "smtp.163.com"; // 指定的smtp服务器
//		String from = "yyoutj@163.com"; // 邮件发送人的邮件地址
//		String recipients = "908974528@qq.com"; // 邮件接收人的邮件地址
//		final String username = "yyoutj@163.com"; // 发件人的邮件帐户
//		final String password = "yyoutj00"; // 发件人的邮件密码

		String host = CommonEmailType.EMAIL_HOST; // 指定的smtp服务器
		String from = CommonEmailType.EMAIL_FROM; // 邮件发送人的邮件地址
		final String userName = CommonEmailType.EMAIL_USERNAME; // 发件人的邮件帐户
		final String password = CommonEmailType.EMAIL_PASSWORD; // 发件人的邮件密码

		// 1.创建Properties 对象
		Properties props = System.getProperties();

		// 2.添加smtp服务器属性
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true"); // 163的stmp不是免费的也不公用的，需要验证
		props.setProperty("mail.transport.protocol", "smtp"); // 设置协议

		// 3.创建邮件会话
		Session session = Session.getDefaultInstance(props, new Authenticator() { // 验账账户
			@Override
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}

		});

		try {
			// 4.定义邮件信息
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddresses = new InternetAddress[to.length];// 收件人地址
			for (int i = 0; i < to.length; i++) {
				toAddresses[i] = new InternetAddress(to[i]);
			}
			message.addRecipients(Message.RecipientType.TO, toAddresses);
			/*
			 * logger.info("to.toString=="+to.toString());
			 * message.addRecipients(Message.RecipientType.TO,
			 * InternetAddress.parse(to.toString()));
			 */

			InternetAddress[] ccAddresses = new InternetAddress[cc.length];// 抄送地址
			for (int i = 0; i < cc.length; i++) {
				ccAddresses[i] = new InternetAddress(cc[i]);
			}
			message.addRecipients(Message.RecipientType.CC, ccAddresses);//

			InternetAddress[] bccAddresses = new InternetAddress[bcc.length];// 密抄地址
			for (int i = 0; i < bcc.length; i++) {
				bccAddresses[i] = new InternetAddress(bcc[i]);
			}
			message.addRecipients(Message.RecipientType.BCC, bccAddresses);

			message.setSubject(subject); // 主题
			// message.setText(content);
			message.setContent("<span style='color:red;margin:0 auto'>" + content + "</span>",
					"text/html;charset=utf-8");

			// 5.发送消息
			// session.getTransport("smtp").send(message); //也可以这样创建Transport对象
			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String[] to = { "908974528@qq.com", "2320745277@qq.com" }; // 邮件接收人的邮件地址
		String[] cc = {}; // 抄送地址
		String[] bcc = { "2967687936@qq.com", "1244178640@qq.com" }; // 秘密抄送地址
		String subject = "RPP UAT"; // 主题
		String content = "hello, Rainson, ziqiang, this is the third email," // 邮件内容
				+ "  please send me the report of RPPUAT and the signoff" + "  best regards." + "  Yu.You.";

		JMailUtil.sendMail(to, cc, bcc, subject, content);
	}
}
