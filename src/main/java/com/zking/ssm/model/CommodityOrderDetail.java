package com.zking.ssm.model;

import lombok.Data;

@Data
public class CommodityOrderDetail {
    private Integer id;

    private Integer orderId;

    private Integer commodityId;

    private String commodityName;

    private Float commodityPrice;

    private Integer commodityQuantity;

    public CommodityOrderDetail(Integer id, Integer orderId, Integer commodityId, String commodityName, Float commodityPrice, Integer commodityQuantity) {
        this.id = id;
        this.orderId = orderId;
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.commodityQuantity = commodityQuantity;
    }

    public CommodityOrderDetail() {
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

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Float getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Float commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }
}