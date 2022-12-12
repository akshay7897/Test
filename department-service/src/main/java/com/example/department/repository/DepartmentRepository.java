package com.example.department.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	@Query("Select d from Department d where d.departmentId = :departmentId")
	public Department findDepartmentById(@Param("departmentId") Long departmentId);
	
	
	public Department findByDepartmentName(String name);

}
