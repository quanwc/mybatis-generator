package com.yiman.entity;

import java.util.Date;

public class ActivityDetail {
    private Integer id;

    private String description;

    private Integer totalReward;

    private Integer topReward;

    private Date startDate;

    private Date expireDate;

    private String type;

    private Byte orderIndex;

    private Date beginRewardDate;

    private Date endRewardDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(Integer totalReward) {
        this.totalReward = totalReward;
    }

    public Integer getTopReward() {
        return topReward;
    }

    public void setTopReward(Integer topReward) {
        this.topReward = topReward;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Byte orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Date getBeginRewardDate() {
        return beginRewardDate;
    }

    public void setBeginRewardDate(Date beginRewardDate) {
        this.beginRewardDate = beginRewardDate;
    }

    public Date getEndRewardDate() {
        return endRewardDate;
    }

    public void setEndRewardDate(Date endRewardDate) {
        this.endRewardDate = endRewardDate;
    }
}