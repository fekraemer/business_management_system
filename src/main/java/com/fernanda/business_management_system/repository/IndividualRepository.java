package com.fernanda.business_management_system.repository;

import com.fernanda.business_management_system.model.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Long> {
}
