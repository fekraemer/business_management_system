package com.fernanda.business_management_system.model.request;

import com.fernanda.business_management_system.enums.Contract;
import com.fernanda.business_management_system.enums.Department;
import com.fernanda.business_management_system.enums.PersonType;
import com.fernanda.business_management_system.enums.Position;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class EmployeeRequest extends IndividualRequest {

    private Double salary;
    private Contract contract;
    private Double commission;
    private Department department;
    private Position position;
    private Boolean healthInsurance;
    private Boolean mealAllowance;
    private Boolean transportAllowance;

    public EmployeeRequest(String cpf, String name, String surname, String email, String phone, String cellphone, String street, int number, String address2, String city, String state, String postalCode, Double salary, Contract contract, Double commission, Department department, Position position, Boolean healthInsurance, Boolean mealAllowance, Boolean transportAllowance) {
        super(cpf, name, surname, email, phone, cellphone, street, number, address2, city, state, postalCode);
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
