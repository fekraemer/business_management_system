package com.fernanda.business_management_system.model.request;

import com.fernanda.business_management_system.enums.PersonType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class IndividualRequest {

    @NotNull(message = "CPF is mandatory")
    private String cpf;

    @NotNull(message = "Name is mandatory")
    @Size(min = 3, max = 20)
    private String name;

    @NotNull(message = "Surname is mandatory")
    private String surname;

    private String email;
    private String phone;

    @Pattern(regexp="(^$|[0-9]{9})", message = "Cellphone number must have 9 digits")
    private String cellphone;

    @NotNull (message = "Person type is mandatory")
    private PersonType personType;

    /*@NotNull(message = "Date is mandatory")
    private LocalDate registrationDate;*/

    private String street;
    private int number;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    //private String country;

    public IndividualRequest(String cpf, String name, String surname, String email, String phone, String  cellphone, LocalDate registrationDate, PersonType personType, String street, int number, String address2, String city, String state, String postalCode, String country) {
        this.cpf = cpf;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        //this.registrationDate = registrationDate;
        this.personType = personType;
        this.street = street;
        this.number = number;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
       // this.country = country;
    }

    public IndividualRequest(String cpf, String name, String surname, String email, String phone, String cellphone, String street, int number, String address2, String city, String state, String postalCode) {
        this.cpf = cpf;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        this.street = street;
        this.number = number;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
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

    /*public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }*/

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
