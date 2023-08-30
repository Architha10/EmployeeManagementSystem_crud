package net.EMSystem.empManagementSys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.EMSystem.empManagementSys.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
