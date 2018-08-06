package com.woniu.supmans.bean.staff;

public class Stock {
    private Integer stockid;

    private Integer stockmid;

    private Integer stocktypeid;

    private Merch merch;

    private Type type;

    public Stock() {
    }

    public Stock(Integer stockid, Integer stockmid, Integer stocktypeid) {
        this.stockid = stockid;
        this.stockmid = stockmid;
        this.stocktypeid = stocktypeid;
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

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getStockmid() {
        return stockmid;
    }

    public void setStockmid(Integer stockmid) {
        this.stockmid = stockmid;
    }

    public Integer getStocktypeid() {
        return stocktypeid;
    }

    public void setStocktypeid(Integer stocktypeid) {
        this.stocktypeid = stocktypeid;
    }
}