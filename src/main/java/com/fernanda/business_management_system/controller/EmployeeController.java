package com.fernanda.business_management_system.controller;

import com.fernanda.business_management_system.model.Employee;
import com.fernanda.business_management_system.model.Individual;
import com.fernanda.business_management_system.model.request.EmployeeRequest;
import com.fernanda.business_management_system.model.request.IndividualRequest;
import com.fernanda.business_management_system.service.EmployeeService;
import com.fernanda.business_management_system.service.IndividualService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Employee Controller", tags = "Employee Controller")
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService service){
        this.employeeService = service;
    }

    @ApiOperation("Find all employees")
    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @ApiOperation("Find an employee by his/her ID")
    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @ApiOperation("Create an employee")
    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody @Valid EmployeeRequest request){
        return new ResponseEntity<>(employeeService.create(request), HttpStatus.CREATED);
    }

//    /*@ApiOperation("Update an employee")
//    @PatchMapping("/{id}")
//    public Employee update (@PathVariable Long id, @RequestBody @Valid EmployeeRequest request){
//        return employeeService.update(id, request);
//    }

//    @ApiOperation("Delete an employee")
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        employeeService.delete(id);
//    }

}
