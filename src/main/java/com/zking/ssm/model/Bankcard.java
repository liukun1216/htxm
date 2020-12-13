package com.zking.ssm.model;

import lombok.Data;

/**
 * 银行卡
 */
@Data
public class Bankcard {
    private Integer id;

    private Integer userid;

    private String bankcard;

    private String bank;

    public Bankcard(Integer id, Integer userid, String bankcard, String bank) {
        this.id = id;
        this.userid = userid;
        this.bankcard = bankcard;
        this.bank = bank;
    }

    public Bankcard() {
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

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}