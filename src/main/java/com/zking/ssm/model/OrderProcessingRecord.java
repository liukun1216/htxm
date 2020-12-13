package com.zking.ssm.model;

import lombok.Data;

import java.util.Date;
@Data
public class OrderProcessingRecord {
    private Integer id;

    private Integer orderId;

    private Integer operatorId;

    private String status;

    private Date time;

    public OrderProcessingRecord(Integer id, Integer orderId, Integer operatorId, String status, Date time) {
        this.id = id;
        this.orderId = orderId;
        this.operatorId = operatorId;
        this.status = status;
        this.time = time;
    }

    public OrderProcessingRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}