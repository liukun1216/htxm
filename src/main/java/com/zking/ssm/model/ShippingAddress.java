package com.zking.ssm.model;

import lombok.Data;

@Data
public class ShippingAddress {
    private Integer id;

    private Integer userid;

    private String address;

    public ShippingAddress(Integer id, Integer userid, String address) {
        this.id = id;
        this.userid = userid;
        this.address = address;
    }

    public ShippingAddress() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}