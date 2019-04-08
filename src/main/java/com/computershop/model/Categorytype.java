package com.computershop.model;

public class Categorytype {
    private Integer tid;

    private String xm;

    private String hp;

    private String dell;

    private String li;

    private String apple;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp == null ? null : hp.trim();
    }

    public String getDell() {
        return dell;
    }

    public void setDell(String dell) {
        this.dell = dell == null ? null : dell.trim();
    }

    public String getLe() {
        return li;
    }

    public void setLe(String le) {
        this.li = le == null ? null : le.trim();
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple == null ? null : apple.trim();
    }
}