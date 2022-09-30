package com.example.demo;

public class sales {
    private String name;
    private String cid;
    private String prc;
    private String qun;
    private String sr;
    private String sid;
    private String tam;

    public sales(String name, String cid, String prc, String qun, String sr, String sid, String tam) {
        this.name = name;
        this.cid = cid;
        this.prc = prc;
        this.qun = qun;
        this.sr = sr;
        this.sid = sid;
        this.tam = tam;
    }

    public String getName() {
        return name;
    }

    public String getCid() {
        return cid;
    }

    public String getPrc() {
        return prc;
    }

    public String getQun() {
        return qun;
    }

    public String getSr() {
        return sr;
    }

    public String getSid() {
        return sid;
    }

    public String getTam() {
        return tam;
    }
}
