package com.fernanda.business_management_system.model;

import com.fernanda.business_management_system.enums.Contract;
import com.fernanda.business_management_system.enums.Department;
import com.fernanda.business_management_system.enums.PersonType;
import com.fernanda.business_management_system.enums.Position;
import org.hibernate.validator.internal.util.Contracts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity(name = "tbl_employee")
@DiscriminatorValue("employee")
public class Employee extends Individual {

    private Double salary;
    @Enumerated(EnumType.STRING)
    private Contract contract;
    private Double commission;
    @Enumerated(EnumType.STRING)
    private Department department;
    @Enumerated(EnumType.STRING)
    private Position position;
    private Boolean healthInsurance;
    private Boolean mealAllowance;
    private Boolean transportAllowance;

    public Employee() {
    }

    public Employee(Long id, String email, String phone, String cellphone, LocalDate registrationDate, Address address, String cpf, String name, String surname, Double salary, Contract contract, Double commission, Department department, Position position, Boolean healthInsurance, Boolean mealAllowance, Boolean transportAllowance) {
        super(id, email, phone, cellphone, registrationDate, address, cpf, name, surname);
        this.salary = salary;
        this.contract = contract;
        this.commission = commission;
        this.department = department;
        this.position = position;
        this.healthInsurance = healthInsurance;
        this.mealAllowance = mealAllowance;
        this.transportAllowance = transportAllowance;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Boolean getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(Boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public Boolean getMealAllowance() {
        return mealAllowance;
    }

    public void setMealAllowance(Boolean mealAllowance) {
        this.mealAllowance = mealAllowance;
    }

    public Boolean getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Boolean transportAllowance) {
        this.transportAllowance = transportAllowance;
    }
}
