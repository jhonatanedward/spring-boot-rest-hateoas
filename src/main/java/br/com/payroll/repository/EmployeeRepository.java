package br.com.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
