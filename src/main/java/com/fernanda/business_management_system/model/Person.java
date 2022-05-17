package com.fernanda.business_management_system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fernanda.business_management_system.enums.PersonType;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String phone;
    @Column(unique = true)
    private String cellphone;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private PersonType personType = PersonType.CLIENT_SUPPLIER;
    @Embedded
    private Address address;

    public Person() {
    }

    public Person(Long id, String email, String phone, String cellphone, LocalDate registrationDate, Address address, PersonType personType) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        this.registrationDate = registrationDate;
        this.address = address;
        this.personType = personType;
    }

    public Person(Long id, String email, String phone, String cellphone, LocalDate registrationDate, Address address) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        this.registrationDate = registrationDate;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }
}



