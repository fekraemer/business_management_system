package com.fernanda.business_management_system.model;

import com.fernanda.business_management_system.enums.PersonType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "tbl_individual")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "origin", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("individual")
public class Individual extends Person{

    @Column(unique = true)
    private String cpf;
    private String name;
    private String surname;

    public Individual() {
    }

    public Individual(Long id, String email, String phone, String cellphone, LocalDate registrationDate, Address address, PersonType personType, String cpf, String name, String surname) {
        super(id, email, phone, cellphone, registrationDate, address, personType);
        this.cpf = cpf;
        this.name = name;
        this.surname = surname;
    }

    public Individual(Long id, String email, String phone, String  cellphone, LocalDate registrationDate, Address address, String cpf, String name, String surname) {
        super(id, email, phone, cellphone, registrationDate, address);
        this.cpf = cpf;
        this.name = name;
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
