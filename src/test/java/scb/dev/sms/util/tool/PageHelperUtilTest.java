package scb.dev.sms.util.tool;

import java.util.ArrayList;
import java.util.List;

public class PageHelperUtilTest {

	 public static void main(String[] args) {
	        List<String> list = new ArrayList<String>();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("d");
	        list.add("e");
	        list.add("f");
	        list.add("g");
	        System.out.println(PageHelperUtil.getPageContentByApi(list, 2, 3).toString());
	    }
}
