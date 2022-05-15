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
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Employee Controller", tags = "Employee Controller")
@RestController
@RequestMapping (value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService service){
        this.employeeService = service;
    }

    @ApiOperation("Find all employees")
    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @ApiOperation("Find an employee by his ID")
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @ApiOperation("Create an employee")
    @PostMapping
    public Employee create(@RequestBody EmployeeRequest request){
        return employeeService.create(request);
    }

    /*@ApiOperation("Update an employee")
    @PatchMapping("/{id}")
    public Employee update (@PathVariable Long id, @RequestBody @Valid EmployeeRequest request){
        return employeeService.update(id, request);
    }

    @ApiOperation("Replace an employee")
    @PutMapping("/{id}")
    public Employee replace (@PathVariable Long id, @RequestBody @Valid EmployeeRequest request){
        return employeeService.replace(id, request);
    }

    @ApiOperation("Delete an employee")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
*/
}
