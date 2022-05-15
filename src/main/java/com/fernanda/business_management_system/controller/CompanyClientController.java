/*
package com.fernanda.business_management_system.controller;

import com.fernanda.business_management_system.service.CompanyClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Company Client Controller", tags = "Company Client Controller")
@RestController
@RequestMapping(value = "/company_client")
public class CompanyClientController {

        private final CompanyClientService companyClientService;

        @Autowired
        public CompanyClientController(CompanyClientService service){
            this.companyClientService = service;
        }

        @ApiOperation("Find all companies")
        @GetMapping
        public List<CompanyClient> findAll(){
            return companyClientService.findAll();
        }

        @ApiOperation("Find a company by its ID")
        @GetMapping("/{id}")
        public CompanyClient findById(@PathVariable Long id){
            return companyClientService.findById(id);
        }

        */
/*@ApiOperation("Create an individual")
        @PostMapping
        public Individual create(@RequestBody @Valid IndividualRequest request){
            return individualService.create(request);
        }

        @ApiOperation("Update an individual")
        @PatchMapping("/{id}")
        public Individual update (@PathVariable Long id, @RequestBody IndividualRequest request){
            return individualService.update(id, request);
        }

        @ApiOperation("Replace an individual")
        @PutMapping("/{id}")
        public Individual replace (@PathVariable Long id, @RequestBody IndividualRequest request){
            return individualService.replace(id, request);
        }

        @ApiOperation("Delete an individual")
        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            individualService.delete(id);
        }*//*


    }
*/
