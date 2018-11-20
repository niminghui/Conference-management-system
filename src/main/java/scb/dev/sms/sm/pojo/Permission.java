package scb.dev.sms.sm.pojo;

public class Permission {
    /**
     * 功能编号
     */
    private String permissionId;

    /**
     * 功能名称
     */
    private String permissionName;

    /**
     * 功能编号
     * @return permission_id 功能编号
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 功能编号
     * @param permissionId 功能编号
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 功能名称
     * @return permission_name 功能名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 功能名称
     * @param permissionName 功能名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}