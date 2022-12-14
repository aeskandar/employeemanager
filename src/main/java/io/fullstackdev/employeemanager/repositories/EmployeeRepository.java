package io.fullstackdev.employeemanager.repositories;

import io.fullstackdev.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void removeEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
