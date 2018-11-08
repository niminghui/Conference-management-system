/**
 * Project Name:scb.sms
 * File Name:Visit.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日上午10:36:20
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

/**
 * ClassName: Visit <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月8日 上午10:36:20 <br/>
 */
public interface Visit {
	/**
	 * 对结点进行某种操作
	 * 
	 * @param btree 树的结点
	 */
	public void visit(Tree tree);
}
