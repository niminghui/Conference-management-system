/**
 * Project Name:scb.sms
 * File Name:BaseController.java
 * Package Name:scb.dev.sms.common
 * Date:2018年11月19日下午3:24:45
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;

/**
 * ClassName: BaseController <br/>
 * Description: 所有Controller的基类. <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月19日 下午3:24:45 <br/>
 */
public class BaseController {
	/**
	 * 
	 * Description: get request attribute.<br/>
	 * 
	 * @param String attributeName
	 * @return Object
	 */
	public Object getAttribute(String attributeName) {
		return this.getRequest().getAttribute(attributeName);
	}

	/**
	 * 
	 * Description: set request attribute.<br/>
	 * 
	 * @param String attributeName, Object object
	 * 
	 */
	public void setAttribute(String attributeName, Object object) {
		this.getRequest().setAttribute(attributeName, object);
	}

	/**
	 * 
	 * Description: get request session.<br/>
	 * 
	 * @param String attributeName
	 * @return Object
	 */
	public Object getSession(String attributeName) {
		return this.getRequest().getSession(true).getAttribute(attributeName);
	}

	/**
	 * 
	 * Description: set request attribute.<br/>
	 * 
	 * @param String attributeName, Object object
	 * 
	 */
	public void setSession(String attributeName, Object object) {
		this.getRequest().getSession(true).setAttribute(attributeName, object);
	}

	/**
	 * 
	 * Description: get request.<br/>
	 * 
	 * @return HttpServletRequest
	 * 
	 */
	public HttpServletRequest getRequest() {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		return ((ServletRequestAttributes) ra).getRequest();
	}

	/**
	 * 
	 * Description: get response.<br/>
	 * 
	 * @return HttpServletResponse
	 * 
	 */
	public HttpServletResponse getResponse() {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		return ((ServletRequestAttributes) ra).getResponse();
	}

	/**
	 * 
	 * Description: 输出JSON化的content.<br/>
	 * 
	 * @param Object content, HttpServletRequest req, HttpServletResponse rsp
	 * 
	 */
	public void printJSON(Object content, HttpServletRequest req, HttpServletResponse rsp) throws IOException {
		req.setCharacterEncoding("utf-8");
		rsp.setCharacterEncoding("utf-8");
		PrintWriter out = rsp.getWriter();
		out.print(JSON.toJSONString(content));
		out.flush();
		out.close();
	}

	/**
	 * 
	 * Description: 输出非JSON化的content.<br/>
	 * 
	 * @param Object content, HttpServletRequest req, HttpServletResponse rsp
	 * 
	 */
	public void print(Object content, HttpServletRequest req, HttpServletResponse rsp) throws IOException {
		req.setCharacterEncoding("utf-8");
		rsp.setCharacterEncoding("utf-8");
		PrintWriter out = rsp.getWriter();
		out.print(content.toString().trim());
		out.flush();
		out.close();
	}
}
