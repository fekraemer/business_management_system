package com.fernanda.business_management_system.service;

import com.fernanda.business_management_system.model.Address;
import com.fernanda.business_management_system.model.Employee;
import com.fernanda.business_management_system.model.Individual;
import com.fernanda.business_management_system.model.request.EmployeeRequest;
import com.fernanda.business_management_system.model.request.IndividualRequest;
import com.fernanda.business_management_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found."));
    }

    public Employee create(EmployeeRequest request) {

        var employee = new Employee();
        employee.setName(request.getName());
        employee.setSurname(request.getSurname());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setCellphone(request.getCellphone());
        employee.setCpf(request.getCpf());
        //employee.setSalary(request.getSalary());
        //TROCAR PARA employee.salaryCalculation();
        employee.setContract(request.getContract());
        employee.setCommission(request.getCommission());
        employee.setDepartment(request.getDepartment());
        employee.setPosition(request.getPosition());
        employee.setHealthInsurance(request.getHealthInsurance());
        employee.setTransportAllowance(request.getTransportAllowance());

        var address = new Address();
        address.setStreet(request.getStreet());
        address.setNumber(request.getNumber());
        address.setAddress2(request.getAddress2());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setPostalCode(request.getPostalCode());

        employee.setAddress(address);
        return employeeRepository.saveAndFlush(employee);

    }

//    public Employee update(Long id, EmployeeRequest request) {
//
//        var employee = findById(id);
//        employee.setName(request.getName());
//        employee.setSurname(request.getSurname());
//        employee.setEmail(request.getEmail());
//        employee.setPhone(request.getPhone());
//        employee.setCellphone(request.getCellphone());
//        //individual.setRegistrationDate(request.getRegistrationDate());
//        employee.setCpf(request.getCpf());
//        employee.setSalary(request.getSalary());
//        employee.setContract(request.getContract());
//        employee.setCommission(request.getCommission());
//        employee.setDepartment(request.getDepartment());
//        employee.setPosition(request.getPosition());
//        employee.setHealthInsurance(request.getHealthInsurance());
//        employee.setTransportAllowance(request.getTransportAllowance());
//        employee.setMealAllowance(request.getMealAllowance());
//
//        //var address = new Address();
////        address.setPostCode(request.getPostCode());
////        address.setCity(request.getCity());
////        address.setState(request.getState());
////        address.setStreet(request.getStreet());
////        address.setNumber(request.getNumber());
//////      address.setDetails(request.getDetails());
////
////        employee.setAddress(address);
//
//        return employeeRepository.saveAndFlush(employee);
//    }
//
//    public void delete(Long id) {
//        employeeRepository.deleteById(id);
//    }

}
