package com.woniu.supmans.bean.admin;

public class Admin {
    private Integer adminid;

    private String adminnum;

    private String adminpass;

    public Admin() {
    }

    public Admin(Integer adminid, String adminnum, String adminpass) {
        this.adminid = adminid;
        this.adminnum = adminnum;
        this.adminpass = adminpass;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminnum() {
        return adminnum;
    }

    public void setAdminnum(String adminnum) {
        this.adminnum = adminnum == null ? null : adminnum.trim();
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass == null ? null : adminpass.trim();
    }
}