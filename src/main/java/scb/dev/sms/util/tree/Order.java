/**
 * Project Name:scb.sms
 * File Name:Order.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日上午10:36:59
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

/**
 * ClassName: Order <br/>
 * Description: Order. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月8日 上午10:36:59 <br/>
 */
public class Order {
	/**
	 * 
	 * Description: 先根遍历.<br/>
	 * 
	 * @param Tree root
	 */
	public void preOrder(Tree root) {
		if (!root.isEmpty()) {
			visit(root);
			for (Tree child : root.getChilds()) {
				if (child != null) {
					preOrder(child);
				}
			}
		}
	}

	/**
	 * 
	 * Description: 后根遍历.<br/>
	 * 
	 * @param Tree root
	 */
	public void postOrder(Tree root) {
		if (!root.isEmpty()) {
			for (Tree child : root.getChilds()) {
				if (child != null) {
					preOrder(child);
				}
			}
			visit(root);
		}
	}

	/**
	 * 
	 * @param Tree tree
	 */
	public void visit(Tree tree) {
		System.out.print("\t" + tree.getRootData());
	}
}
