package com.fernanda.business_management_system.model.request;

import com.fernanda.business_management_system.enums.PersonType;
import com.fernanda.business_management_system.enums.State;

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
    @Size(min = 3, max = 40)
    private String surname;

    private String email;
    private String phone;

    @Pattern(regexp="(^((\\(\\d{2}\\))|\\d{2})[- .]?\\d{9}$)", message = "Cellphone number must have 11 digits (DDD + phone number).")
    private String cellphone;

    @NotNull (message = "Person type is mandatory")
    private PersonType personType;

    private String street;
    private int number;
    private String address2;
    private String city;
    private State state;
    private String postalCode;

    public IndividualRequest() {
    }

    public IndividualRequest(String cpf, String name, String surname, String email, String phone, String  cellphone, PersonType personType, String street, int number, String address2, String city, State state, String postalCode) {
        this.cpf = cpf;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.cellphone = cellphone;
        this.personType = personType;
        this.street = street;
        this.number = number;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public IndividualRequest(String cpf, String name, String surname, String email, String phone, String cellphone, String street, int number, String address2, String city, State state, String postalCode) {
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
