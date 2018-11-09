package scb.dev.sms.sm.vo;

import java.util.List;

/**
 * 分页后返回前端对象
 * @author Weilei
 *
 */
public class PageInfoVO {

	private int totalPages;

	private List data;

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	@Override
	public String toString() {
		return "PageInfoVo{" + "totalPages=" + totalPages + ", data=" + data + '}';
	}
}
