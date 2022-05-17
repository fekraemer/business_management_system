package com.fernanda.business_management_system.service;

import com.fernanda.business_management_system.model.Address;
import com.fernanda.business_management_system.model.Individual;
import com.fernanda.business_management_system.model.request.IndividualRequest;
import com.fernanda.business_management_system.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class IndividualService {

    @Autowired
    private IndividualRepository individualRepository;

    public List<Individual> findAll(){
        return individualRepository.findAll();
    }

    public Individual findById(Long id) {
        return individualRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Individual {%s} not found.", id)));
    }

    public Individual create(IndividualRequest request){

        var individual = new Individual();
        individual.setName(request.getName());
        individual.setSurname(request.getSurname());
        individual.setEmail(request.getEmail());
        individual.setPhone(request.getPhone());
        individual.setCellphone(request.getCellphone());
        individual.setCpf(request.getCpf());
        individual.setPersonType(request.getPersonType());

        var address = new Address();
        address.setStreet(request.getStreet());
        address.setNumber(request.getNumber());
        address.setAddress2(request.getAddress2());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setPostalCode(request.getPostalCode());

        individual.setAddress(address);
        return individualRepository.saveAndFlush(individual);

    }

//    public Individual update(Long id, IndividualRequest request) {
//
//        var individual = findById(id);
//        individual.setName(request.getName());
//        individual.setSurname(request.getSurname());
//        individual.setEmail(request.getEmail());
//        individual.setPhone(request.getPhone());
//        individual.setCellphone(request.getCellphone());
//        individual.setCpf(request.getCpf());
//        individual.setPersonType(request.getPersonType());
//
//        //Address address = findById(id);
////      address.setPostCode(request.getPostCode());
////      address.setCity(request.getCity());
////      address.setState(request.getState());
////      address.setStreet(request.getStreet());
////      address.setNumber(request.getNumber());
////      address.setDetails(request.getDetails());
//        return individualRepository.saveAndFlush(individual);
//    }
//
//    public void delete(Long id) {
//        individualRepository.deleteById(id);
//    }

}
