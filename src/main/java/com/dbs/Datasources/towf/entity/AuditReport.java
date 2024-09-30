package com.dbs.Datasources.towf.entity;


import jakarta.persistence.*;

import java.sql.Driver;
import java.util.Date;

@Entity
@Table(name = "tb_towf_audit_report")
public class AuditReport {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "heads")
    private String heads;
    @Column(name = "product")
    private String product;

    private Date timeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeads() {
        return heads;
    }

    public void setHeads(String heads) {
        this.heads = heads;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }



    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "AuditReport{" +
                "id=" + id +
                ", heads='" + heads + '\'' +
                ", product='" + product + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public AuditReport() {
    }
}
