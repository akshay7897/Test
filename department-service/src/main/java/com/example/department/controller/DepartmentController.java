package com.example.department.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;



@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department)  {
	
		return new ResponseEntity<Department>(departmentService.saveDepartment(department),HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
		
		Department deptId = departmentService.findDepartmentById(departmentId);
		
		if(deptId==null) {
			return new ResponseEntity<Department>(deptId,HttpStatus.NO_CONTENT);
		}else {
				return new ResponseEntity<Department>(deptId,HttpStatus.OK);
		}
	}
}
