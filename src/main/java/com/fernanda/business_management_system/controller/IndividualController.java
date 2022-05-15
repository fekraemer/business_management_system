package com.fernanda.business_management_system.controller;

import com.fernanda.business_management_system.model.Individual;
import com.fernanda.business_management_system.model.request.IndividualRequest;
import com.fernanda.business_management_system.service.IndividualService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Individual Controller", tags = "Individual Controller")
@RestController
@RequestMapping (value = "/individual")
public class IndividualController {

    private final IndividualService individualService;

    @Autowired
    public IndividualController(IndividualService service){
        this.individualService = service;
    }

    @ApiOperation("Find all individual")
    @GetMapping
    public List<Individual> findAll(){
        return individualService.findAll();
    }

    @ApiOperation("Find an individual by his ID")
    @GetMapping("/{id}")
    public Individual findById(@PathVariable Long id){
        return individualService.findById(id);
    }

    @ApiOperation("Create an individual")
    @PostMapping
    public Individual create(@RequestBody IndividualRequest request){
        return individualService.create(request);
    }

    @ApiOperation("Update an individual")
    @PatchMapping("/{id}")
    public Individual update (@PathVariable Long id, @RequestBody @Valid IndividualRequest request){
        return individualService.update(id, request);
    }

    @ApiOperation("Replace an individual")
    @PutMapping("/{id}")
    public Individual replace (@PathVariable Long id, @RequestBody @Valid IndividualRequest request){
        return individualService.replace(id, request);
    }

    @ApiOperation("Delete an individual")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        individualService.delete(id);
    }

}
