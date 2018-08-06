package com.woniu.supmans.bean.staff;

public class Sold {
    private Integer soldid;

    private Integer soldnid;

    private String soldnumber;

    private String soldprice;

    private Integer soldtid;

    private Merch merch;

    private Type type;

    public Sold() {
    }

    public Sold(Integer soldid, Integer soldnid, String soldnumber, String soldprice, Integer soldtid) {
        this.soldid = soldid;
        this.soldnid = soldnid;
        this.soldnumber = soldnumber;
        this.soldprice = soldprice;
        this.soldtid = soldtid;
    }

    public Merch getMerch() {
        return merch;
    }

    public void setMerch(Merch merch) {
        this.merch = merch;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getSoldid() {
        return soldid;
    }

    public void setSoldid(Integer soldid) {
        this.soldid = soldid;
    }

    public Integer getSoldnid() {
        return soldnid;
    }

    public void setSoldnid(Integer soldnid) {
        this.soldnid = soldnid;
    }

    public String getSoldnumber() {
        return soldnumber;
    }

    public void setSoldnumber(String soldnumber) {
        this.soldnumber = soldnumber == null ? null : soldnumber.trim();
    }

    public String getSoldprice() {
        return soldprice;
    }

    public void setSoldprice(String soldprice) {
        this.soldprice = soldprice == null ? null : soldprice.trim();
    }

    public Integer getSoldtid() {
        return soldtid;
    }

    public void setSoldtid(Integer soldtid) {
        this.soldtid = soldtid;
    }
}