package com.muke.ssh.domain;

/**
 * Created by wanganyu on 2017/06/15.
 */
public class Product {
    private Integer pid;
    private String pname;
    private Double price;

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public Double getPrice() {
        return price;
    }
}
