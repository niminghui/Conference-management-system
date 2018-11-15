package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Position {
    /**
     * 职位编号
     */
    private String positionId;

    /**
     * 职位名称
     */
    private String positionName;

    /**
     * 角色组编号
     */
    private String rolegroupId;

    /**
     * 修改人名
     */
    private String positionUpdatedUser;

    /**
     * 修改时间
     */
    private Date positionUpdatedTime;

    /**
     * 创建人名
     */
    private String positionCreatedUser;

    /**
     * 创建时间
     */
    private Date positionCreatedTime;

    /**
     * 职位编号
     * @return position_id 职位编号
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * 职位编号
     * @param positionId 职位编号
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    /**
     * 职位名称
     * @return position_name 职位名称
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * 职位名称
     * @param positionName 职位名称
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    /**
     * 角色组编号
     * @return rolegroup_id 角色组编号
     */
    public String getRolegroupId() {
        return rolegroupId;
    }

    /**
     * 角色组编号
     * @param rolegroupId 角色组编号
     */
    public void setRolegroupId(String rolegroupId) {
        this.rolegroupId = rolegroupId;
    }

    /**
     * 修改人名
     * @return position_updated_user 修改人名
     */
    public String getPositionUpdatedUser() {
        return positionUpdatedUser;
    }

    /**
     * 修改人名
     * @param positionUpdatedUser 修改人名
     */
    public void setPositionUpdatedUser(String positionUpdatedUser) {
        this.positionUpdatedUser = positionUpdatedUser;
    }

    /**
     * 修改时间
     * @return position_updated_time 修改时间
     */
    public Date getPositionUpdatedTime() {
        return positionUpdatedTime;
    }

    /**
     * 修改时间
     * @param positionUpdatedTime 修改时间
     */
    public void setPositionUpdatedTime(Date positionUpdatedTime) {
        this.positionUpdatedTime = positionUpdatedTime;
    }

    /**
     * 创建人名
     * @return position_created_user 创建人名
     */
    public String getPositionCreatedUser() {
        return positionCreatedUser;
    }

    /**
     * 创建人名
     * @param positionCreatedUser 创建人名
     */
    public void setPositionCreatedUser(String positionCreatedUser) {
        this.positionCreatedUser = positionCreatedUser;
    }

    /**
     * 创建时间
     * @return position_created_time 创建时间
     */
    public Date getPositionCreatedTime() {
        return positionCreatedTime;
    }

    /**
     * 创建时间
     * @param positionCreatedTime 创建时间
     */
    public void setPositionCreatedTime(Date positionCreatedTime) {
        this.positionCreatedTime = positionCreatedTime;
    }
}