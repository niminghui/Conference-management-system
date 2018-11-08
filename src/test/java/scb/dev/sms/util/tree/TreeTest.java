/**
 * Project Name:scb.sms
 * File Name:TreeTest.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日上午10:45:53
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

import org.junit.Test;

/**
 * ClassName: TreeTest <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 */

public class TreeTest {

	@Test
	public void test() {
		Tree root = new Tree("A");
		root.addNode(new Tree("B"));
		root.addNode(new Tree("C"));
		root.addNode(new Tree("D"));
		Tree t = null;
		t = root.getChild(0);
		t.addNode(new Tree("L"));
		t.addNode(new Tree("E"));
		t = root.getChild(1);
		t.addNode(new Tree("F"));
		t = root.getChild(2);
		t.addNode(new Tree("I"));
		t.addNode(new Tree("H"));
		t = t.getFirstChild();
		t.addNode(new Tree("L"));

		System.out.println("first node:" + root.getRootData());
		// System.out.println("size:" + root.size());
		// System.out.println("dept:" + root.dept());
		System.out.println("is left:" + root.isLeaf());
		System.out.println("data:" + root.getRootData());

		Order order = new Order();
		System.out.println("前根遍历：");
		order.preOrder(root);
		System.out.println("\n后根遍历：");
		order.postOrder(root);
	}

}
