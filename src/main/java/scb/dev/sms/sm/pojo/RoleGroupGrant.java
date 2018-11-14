package scb.dev.sms.sm.pojo;

import java.util.Date;

public class RoleGroupGrant {
    /**
     * 角色组编号
     */
    private String rgRolegroupId;

    /**
     * 菜单编号
     */
    private String rgMenuId;

    /**
     * 创建人名
     */
    private String rgCreatedUser;

    /**
     * 创建时间
     */
    private Date rgCreatedTime;

    /**
     * 修改人名
     */
    private String rgUpdatedUser;

    /**
     * 修改时间
     */
    private Date rgUpdatedTime;

    /**
     * 角色组编号
     * @return rg_rolegroup_id 角色组编号
     */
    public String getRgRolegroupId() {
        return rgRolegroupId;
    }

    /**
     * 角色组编号
     * @param rgRolegroupId 角色组编号
     */
    public void setRgRolegroupId(String rgRolegroupId) {
        this.rgRolegroupId = rgRolegroupId;
    }

    /**
     * 菜单编号
     * @return rg_menu_id 菜单编号
     */
    public String getRgMenuId() {
        return rgMenuId;
    }

    /**
     * 菜单编号
     * @param rgMenuId 菜单编号
     */
    public void setRgMenuId(String rgMenuId) {
        this.rgMenuId = rgMenuId;
    }

    /**
     * 创建人名
     * @return rg_created_user 创建人名
     */
    public String getRgCreatedUser() {
        return rgCreatedUser;
    }

    /**
     * 创建人名
     * @param rgCreatedUser 创建人名
     */
    public void setRgCreatedUser(String rgCreatedUser) {
        this.rgCreatedUser = rgCreatedUser;
    }

    /**
     * 创建时间
     * @return rg_created_time 创建时间
     */
    public Date getRgCreatedTime() {
        return rgCreatedTime;
    }

    /**
     * 创建时间
     * @param rgCreatedTime 创建时间
     */
    public void setRgCreatedTime(Date rgCreatedTime) {
        this.rgCreatedTime = rgCreatedTime;
    }

    /**
     * 修改人名
     * @return rg_updated_user 修改人名
     */
    public String getRgUpdatedUser() {
        return rgUpdatedUser;
    }

    /**
     * 修改人名
     * @param rgUpdatedUser 修改人名
     */
    public void setRgUpdatedUser(String rgUpdatedUser) {
        this.rgUpdatedUser = rgUpdatedUser;
    }

    /**
     * 修改时间
     * @return rg_updated_time 修改时间
     */
    public Date getRgUpdatedTime() {
        return rgUpdatedTime;
    }

    /**
     * 修改时间
     * @param rgUpdatedTime 修改时间
     */
    public void setRgUpdatedTime(Date rgUpdatedTime) {
        this.rgUpdatedTime = rgUpdatedTime;
    }
}