package com.hibernate.sample.webapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contract_employee")
public class ContractEmployee extends Employee {

    @Column(name = "pay_per_hour")
    private double payPerHour;

    @Column(name = "duration")
    private String duration;

    public ContractEmployee() {
    }

    public ContractEmployee(Long id, String name, double payPerHour, String duration) {
        super(id, name);
        this.payPerHour = payPerHour;
        this.duration = duration;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
