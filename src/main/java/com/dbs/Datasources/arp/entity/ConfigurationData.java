package com.dbs.Datasources.arp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "tb_arp_configuration_data")
public class ConfigurationData {

    @Id
    private int id;
    private String name;
    private String value;
    private Date timeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public ConfigurationData(int id, String name, String value, Date timeStamp) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "ConfigurationData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public ConfigurationData() {
    }
}
