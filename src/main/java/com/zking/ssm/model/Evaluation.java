package com.zking.ssm.model;

import lombok.Data;

import java.util.Date;
@Data
public class Evaluation {
    private Integer id;

    private Integer orderDetailId;

    private Integer grade;

    private String image;

    private Date time;

    private String content;

    public Evaluation(Integer id, Integer orderDetailId, Integer grade, String image, Date time, String content) {
        this.id = id;
        this.orderDetailId = orderDetailId;
        this.grade = grade;
        this.image = image;
        this.time = time;
        this.content = content;
    }

    public Evaluation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}