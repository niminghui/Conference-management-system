/**
 * Project Name:scb.sms
 * File Name:MenuCompare.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日下午2:47:15
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

import java.util.Comparator;

import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.pojo.Menu;

/**
 * ClassName: MenuCompare <br/>
 * Description: MenuCompare. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月8日 下午2:47:15 <br/>
 */
public class DepartmentCompare2 implements Comparator<Department> {

	/**
	 * Department compare.
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	

	@Override
	public int compare(Department o1, Department o2) {
		if (Integer.valueOf(o1.getDepartmentOrderid()) < Integer.valueOf(o2.getDepartmentOrderid())) {
			return -1;
		}
		return 1;
		
	}

}
