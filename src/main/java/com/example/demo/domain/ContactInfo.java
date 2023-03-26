package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ContactInfo {
    @Id
    @Column(name="cid")
    private int cid;

    @Column(name = "email")
    private String email;

    @Column(name = "home_tel_no")
    private String homeTelNo;

    @Column(name=" mobile_num")
    private String mobileTelNo;

    public ContactInfo(int cid, String email, String homeTelNo, String mobileTelNo) {
        this.cid = cid;
        this.email = email;
        this.homeTelNo = homeTelNo;
        this.mobileTelNo = mobileTelNo;
    }

    public ContactInfo() {

    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeTelNo() {
        return homeTelNo;
    }

    public void setHomeTelNo(String homeTelNo) {
        this.homeTelNo = homeTelNo;
    }

    public String getMobileTelNo() {
        return mobileTelNo;
    }

    public void setMobileTelNo(String mobileTelNo) {
        this.mobileTelNo = mobileTelNo;
    }
}
