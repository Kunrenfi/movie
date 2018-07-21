package com.llk.vip.entity;


import java.util.Date;

/**
 * Created by 林力克 on 2018/7/13.
 */
public class MovieEntity {
    private String mid;
    private String mname;
    private String mprice;
    private Date mstarttime;
    private Date mendtime;
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMprice() {
        return mprice;
    }

    public void setMprice(String mprice) {
        this.mprice = mprice;
    }

    public Date getMstarttime() {
        return mstarttime;
    }

    public void setMstarttime(Date mstarttime) {
        this.mstarttime = mstarttime;
    }

    public Date getMendtime() {
        return mendtime;
    }

    public void setMendtime(Date mendtime) {
        this.mendtime = mendtime;
    }




}
