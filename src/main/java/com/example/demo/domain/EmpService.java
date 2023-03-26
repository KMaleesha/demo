package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class EmpService {
    @Id
    @Column(name = "eid")
    private int eid;

    @Column(name= "service_name")
    private String serviceName;

    @Column(name ="service_Date")
    private String serviceDate;

    @Column(name ="service_Time")
    private String serviceTime;

    public EmpService(int eid, String serviceName, String serviceDate, String serviceTime) {
        this.eid = eid;
        this.serviceName = serviceName;
        this.serviceDate = serviceDate;
        this.serviceTime = serviceTime;
    }

    public EmpService() {

    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEid() {
        return eid;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }
}
