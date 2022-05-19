
package com.fernanda.business_management_system.repository;

import com.fernanda.business_management_system.model.Employee;
import com.fernanda.business_management_system.model.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

