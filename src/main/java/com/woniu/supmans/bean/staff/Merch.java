package com.woniu.supmans.bean.staff;

public class Merch {
    private Integer merchid;

    private String merchname;

    private String merchaddress;

    private String merchpd;

    private String merchgp;

    private String merchprice;

    private Integer merchtype;

    private String merchnumber;

    private Type type;

    public Merch() {
    }

    public Merch(Integer merchid, String merchname, String merchaddress, String merchpd, String merchgp, String merchprice, Integer merchtype, String merchnumber) {
        this.merchid = merchid;
        this.merchname = merchname;
        this.merchaddress = merchaddress;
        this.merchpd = merchpd;
        this.merchgp = merchgp;
        this.merchprice = merchprice;
        this.merchtype = merchtype;
        this.merchnumber = merchnumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getMerchid() {
        return merchid;
    }

    public void setMerchid(Integer merchid) {
        this.merchid = merchid;
    }

    public String getMerchname() {
        return merchname;
    }

    public void setMerchname(String merchname) {
        this.merchname = merchname == null ? null : merchname.trim();
    }

    public String getMerchaddress() {
        return merchaddress;
    }

    public void setMerchaddress(String merchaddress) {
        this.merchaddress = merchaddress == null ? null : merchaddress.trim();
    }

    public String getMerchpd() {
        return merchpd;
    }

    public void setMerchpd(String merchpd) {
        this.merchpd = merchpd == null ? null : merchpd.trim();
    }

    public String getMerchgp() {
        return merchgp;
    }

    public void setMerchgp(String merchgp) {
        this.merchgp = merchgp == null ? null : merchgp.trim();
    }

    public String getMerchprice() {
        return merchprice;
    }

    public void setMerchprice(String merchprice) {
        this.merchprice = merchprice == null ? null : merchprice.trim();
    }

    public Integer getMerchtype() {
        return merchtype;
    }

    public void setMerchtype(Integer merchtype) {
        this.merchtype = merchtype;
    }

    public String getMerchnumber() {
        return merchnumber;
    }

    public void setMerchnumber(String merchnumber) {
        this.merchnumber = merchnumber == null ? null : merchnumber.trim();
    }
}