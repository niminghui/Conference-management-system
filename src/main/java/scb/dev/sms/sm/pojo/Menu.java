/**
 * Project Name:clps.sms
 * File Name:MenuEntity.java
 * Package Name:com.clps.dev.demo.tree
 * Date:2018年11月8日上午11:59:48
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.pojo;

/**
 * ClassName: Menu <br/>
 * Description: Menu Entity<br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8
 * date: 2018年11月8日 上午11:59:48 <br/>
 */

import java.util.ArrayList;
import java.util.List;

public class Menu {
	// 数据库字段
	private String id;
	private String name;
	private String pid;
	private String icon;
	private String url;
	// 辅助字段
	private List<Menu> children;

	/**
	 * 
	 * Creates a new instance of MenuEntity.
	 *
	 */
	public Menu() {
		super();
		children = new ArrayList<Menu>();
	}

	/**
	 * 
	 * Creates a new instance of MenuEntity.
	 *
	 * @param id
	 * @param name
	 * @param pid
	 */
	public Menu(String id, String name, String pid) {
		this();
		this.id = id;
		this.name = name;
		this.pid = pid;
	}

	/**
	 * id.
	 *
	 * @return the id
	 * @since JDK 1.8
	 */
	public String getId() {
		return id;
	}

	/**
	 * id.
	 *
	 * @param id the id to set
	 * @since JDK 1.8
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * name.
	 *
	 * @return the name
	 * @since JDK 1.8
	 */
	public String getName() {
		return name;
	}

	/**
	 * name.
	 *
	 * @param name the name to set
	 * @since JDK 1.8
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * pid.
	 *
	 * @return the pid
	 * @since JDK 1.8
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * pid.
	 *
	 * @param pid the pid to set
	 * @since JDK 1.8
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * icon.
	 *
	 * @return the icon
	 * @since JDK 1.8
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * icon.
	 *
	 * @param icon the icon to set
	 * @since JDK 1.8
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * url.
	 *
	 * @return the url
	 * @since JDK 1.8
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * url.
	 *
	 * @param url the url to set
	 * @since JDK 1.8
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * children.
	 *
	 * @return the children
	 * @since JDK 1.8
	 */
	public List<Menu> getChildren() {
		return children;
	}

	/**
	 * children.
	 *
	 * @param children the children to set
	 * @since JDK 1.8
	 */
	public void setChildren(List<Menu> children) {
		this.children = children;
	}

}
