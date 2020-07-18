package com.hibernate.sample.webapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regular_employee")
public class RegularEmployee extends Employee {

    @Column(name = "salary")
    private double salary;

    @Column(name = "bonus")
    private double bonus;

    public RegularEmployee() {
    }

    public RegularEmployee(String name, double salary, double bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
