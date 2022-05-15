/*
package com.fernanda.business_management_system.service;

import com.fernanda.business_management_system.repository.CompanyClientRepository;
import com.fernanda.business_management_system.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CompanyClientService {

        @Autowired
        private CompanyClientRepository companyClientRepository;

        public List<CompanyClient> findAll(){
            return companyClientRepository.findAll();
        }

        public CompanyClient findById(Long id) {
            return companyClientRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Company client not found."));
        }

        */
/*public Individual create(IndividualRequest request){

            var individual = new Individual();
            individual.setName(request.getName());
            individual.setSurname(request.getSurname());
            individual.setEmail(request.getEmail());
            individual.setPhone(request.getPhone());
            individual.setCellphone(request.getCellphone());
            individual.setRegistrationDate(request.getRegistrationDate());
            individual.setCpf(request.getCpf());
            individual.setPersonType((request.getPersonType()));
            return individualRepository.saveAndFlush(individual);
        }

        public Individual update(Long id, IndividualRequest request) {

            var individual = findById(id);
            individual.setName(request.getName());
            individual.setSurname(request.getSurname());
            individual.setEmail(request.getEmail());
            individual.setPhone(request.getPhone());
            individual.setCellphone(request.getCellphone());
            individual.setRegistrationDate(request.getRegistrationDate());
            individual.setCpf(request.getCpf());
            individual.setPersonType((request.getPersonType()));
            return individualRepository.saveAndFlush(individual);
        }

        public Individual replace (Long id, IndividualRequest request) {

            var individual = findById(id);
            individual.setName(request.getName());
            individual.setSurname(request.getSurname());
            individual.setEmail(request.getEmail());
            individual.setPhone(request.getPhone());
            individual.setCellphone(request.getCellphone());
            individual.setRegistrationDate(request.getRegistrationDate());
            individual.setCpf(request.getCpf());
            individual.setPersonType((request.getPersonType()));
            return individualRepository.saveAndFlush(individual);
        }

        public void delete(Long id) {
            individualRepository.deleteById(id);
        }

    }*//*

}
*/
