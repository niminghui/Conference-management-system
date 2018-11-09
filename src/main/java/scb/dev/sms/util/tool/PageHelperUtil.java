package scb.dev.sms.util.tool;

import java.util.List;

import scb.dev.sms.sm.vo.PageInfoVO;

/**
 *分页工具
 * @author Weilei
 *
 */
public class PageHelperUtil {

	/**
     * 使用原生 Java api 进行手动分页
     *
     * @param list
     * @param pageNo   第几页
     * @param pageSize 一页多少条
     */
    public static PageInfoVO getPageContentByApi(List list, int pageNo, int pageSize) {

        //总记录数
        int total = list.size();
        PageInfoVO pageInfoVo = new PageInfoVO();
        List<String> subList = null;
        for (int i = 0; i <= total; i++) {
            // 开始索引
            int fromIndex = (pageNo - 1) * pageSize;
            // 结束索引
            int toIndex = fromIndex + pageSize;
            // 如果结束索引大于集合的最大索引，那么规定结束索引=集合大小
            if (toIndex > total) {
                toIndex = total;
            }
            if (fromIndex <= total) {
                subList = list.subList(fromIndex, toIndex);
                pageInfoVo.setTotalPages(total / pageSize + 1);
                pageInfoVo.setData(subList);
                if (toIndex >= fromIndex) {
                    break;
                }
            }
        }
        return pageInfoVo;
    }
}
