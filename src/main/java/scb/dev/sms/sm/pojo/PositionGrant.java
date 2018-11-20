package scb.dev.sms.sm.pojo;

import java.io.Serializable;
import java.util.Date;

public class PositionGrant implements Serializable{
    /**
     * 职位编号
     */
    private String pgPositionId;

    /**
     * 菜单编号
     */
    private String pgMenuId;

    /**
     * 创建人名
     */
    private String pgCreatedUser;

    /**
     * 创建时间
     */
    private Date pgCreatedTime;

    /**
     * 修改人名
     */
    private String pgUpdatedUser;

    /**
     * 修改时间
     */
    private Date pgUpdatedTime;

    /**
     * 职位编号
     * @return pg_position_id 职位编号
     */
    public String getPgPositionId() {
        return pgPositionId;
    }

    /**
     * 职位编号
     * @param pgPositionId 职位编号
     */
    public void setPgPositionId(String pgPositionId) {
        this.pgPositionId = pgPositionId;
    }

    /**
     * 菜单编号
     * @return pg_menu_id 菜单编号
     */
    public String getPgMenuId() {
        return pgMenuId;
    }

    /**
     * 菜单编号
     * @param pgMenuId 菜单编号
     */
    public void setPgMenuId(String pgMenuId) {
        this.pgMenuId = pgMenuId;
    }

    /**
     * 创建人名
     * @return pg_created_user 创建人名
     */
    public String getPgCreatedUser() {
        return pgCreatedUser;
    }

    /**
     * 创建人名
     * @param pgCreatedUser 创建人名
     */
    public void setPgCreatedUser(String pgCreatedUser) {
        this.pgCreatedUser = pgCreatedUser;
    }

    /**
     * 创建时间
     * @return pg_created_time 创建时间
     */
    public Date getPgCreatedTime() {
        return pgCreatedTime;
    }

    /**
     * 创建时间
     * @param pgCreatedTime 创建时间
     */
    public void setPgCreatedTime(Date pgCreatedTime) {
        this.pgCreatedTime = pgCreatedTime;
    }

    /**
     * 修改人名
     * @return pg_updated_user 修改人名
     */
    public String getPgUpdatedUser() {
        return pgUpdatedUser;
    }

    /**
     * 修改人名
     * @param pgUpdatedUser 修改人名
     */
    public void setPgUpdatedUser(String pgUpdatedUser) {
        this.pgUpdatedUser = pgUpdatedUser;
    }

    /**
     * 修改时间
     * @return pg_updated_time 修改时间
     */
    public Date getPgUpdatedTime() {
        return pgUpdatedTime;
    }

    /**
     * 修改时间
     * @param pgUpdatedTime 修改时间
     */
    public void setPgUpdatedTime(Date pgUpdatedTime) {
        this.pgUpdatedTime = pgUpdatedTime;
    }
}