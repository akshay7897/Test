package com.example.department.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import com.example.department.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	
	public Department saveDepartment(Department department){

			return departmentRepository.save(department);
	
	}

	public Department findDepartmentById(Long departmentId) {
		
		return departmentRepository.findDepartmentById(departmentId);
	}
}
