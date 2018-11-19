/**
 * Project Name:clps.sms
 * File Name:AccountController.java
 * Package Name:com.clps.dev.sms.sm.controller
 * Date:2018年10月31日下午2:11:13
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: AccountController <br/>
 * Description: AccountController. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午2:11:13 <br/>
 */
@Controller
public class AccountController {
	@GetMapping("/yzm")
	public void yzm(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 设置页面不缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		// 在内存中创建图像
		int width = 100, height = 52;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 获取图形上下文
		Graphics g = image.getGraphics();
		// 创建随机数对象
		Random random = new Random();
		// 设定背景色
		g.setColor(new Color(255, 245, 247));
		g.fillRect(0, 0, width, height);
		// 设定字体
		g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		// 随机产生干扰线，使图像中的认证码不易被其他程序探测到
		for (int i = 0; i < 30; i++) {
			int xs = random.nextInt(width); // x坐标开始
			int ys = random.nextInt(height); // y坐标开始
			int xe = xs + random.nextInt(width / 8); // x坐标结束
			int ye = ys + random.nextInt(height / 8); // y坐标结束
			int red = random.nextInt(255);
			int green = random.nextInt(255);
			int blue = random.nextInt(255);
			g.setColor(new Color(red, green, blue));
			g.drawLine(xs, ys, xe, ye);
		}
		// 取随机产生的认证码（4位数字）
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			// 将认证码显示到图像中
			g.setColor(new Color(30 + random.nextInt(160), 40 + random.nextInt(170), 40 + random.nextInt(180)));
			g.drawString(rand, 20 * i + 15, 34);
		}
		// 将认证码存入session
		request.getSession().setAttribute("yzm", sRand);
		g.dispose();
		// 输出图像到页面
		ImageIO.write(image, "JPEG", response.getOutputStream());
		request.getSession().setAttribute("yzm", sRand);
	}
}
