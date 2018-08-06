package com.woniu.supmans.bean.staff;

public class Staff {
    private Integer staffid;

    private String staffnumber;

    private String staffpassword;

    private String staffname;

    private String staffsex;

    private String staffcontact;

    public Staff() {
    }

    public Staff(Integer staffid, String staffnumber, String staffpassword, String staffname, String staffsex, String staffcontact) {
        this.staffid = staffid;
        this.staffnumber = staffnumber;
        this.staffpassword = staffpassword;
        this.staffname = staffname;
        this.staffsex = staffsex;
        this.staffcontact = staffcontact;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffnumber() {
        return staffnumber;
    }

    public void setStaffnumber(String staffnumber) {
        this.staffnumber = staffnumber == null ? null : staffnumber.trim();
    }

    public String getStaffpassword() {
        return staffpassword;
    }

    public void setStaffpassword(String staffpassword) {
        this.staffpassword = staffpassword == null ? null : staffpassword.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public String getStaffcontact() {
        return staffcontact;
    }

    public void setStaffcontact(String staffcontact) {
        this.staffcontact = staffcontact == null ? null : staffcontact.trim();
    }
}