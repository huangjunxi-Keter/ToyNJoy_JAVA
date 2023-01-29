package pers.keter.toynjoy.entity;

import java.util.Date;

public class WishList {
    private Integer id;

    private String userName;

    private Integer productId;

    private Integer serialNamber;

    private Date joinDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSerialNamber() {
        return serialNamber;
    }

    public void setSerialNamber(Integer serialNamber) {
        this.serialNamber = serialNamber;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}