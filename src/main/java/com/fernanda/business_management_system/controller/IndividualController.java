package com.fernanda.business_management_system.controller;

import com.fernanda.business_management_system.model.Individual;
import com.fernanda.business_management_system.model.request.IndividualRequest;
import com.fernanda.business_management_system.service.IndividualService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Individual Controller", tags = "Individual Controller")
@RestController
@RequestMapping(value = "/individual", produces = MediaType.APPLICATION_JSON_VALUE)
public class IndividualController {

    private final IndividualService individualService;

    @Autowired
    public IndividualController(IndividualService service){
        this.individualService = service;
    }

    @ApiOperation("Find all individuals (order by ID)")
    @GetMapping
    public ResponseEntity<List<Individual>> findAll(){
        return new ResponseEntity<>(individualService.findAll(), HttpStatus.OK);
    }

    @ApiOperation("Find an individual by his ID")
    @GetMapping("/{id}")
    public ResponseEntity<Individual> findById(@PathVariable ("id") Long id) {
        return new ResponseEntity<>(individualService.findById(id), HttpStatus.OK);
    }

    @ApiOperation("Create an individual")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Individual> create(@RequestBody @Valid IndividualRequest request){
        return new ResponseEntity<>(individualService.create(request), HttpStatus.CREATED);
    }

//    @ApiOperation("Update an individual")
//    @PatchMapping("/{id}")
//    public Individual update (@PathVariable Long id, @RequestBody @Valid IndividualRequest request){
//        return individualService.update(id, request);
//    }
//
//    @ApiOperation("Delete an individual")
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        individualService.delete(id);
//    }

}
