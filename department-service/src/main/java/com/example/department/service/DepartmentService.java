package com.example.department.service;

import com.example.department.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department) ;
	public Department findDepartmentById(Long departmentId);
}
