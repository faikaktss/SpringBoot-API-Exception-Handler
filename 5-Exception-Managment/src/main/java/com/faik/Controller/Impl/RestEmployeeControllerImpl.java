package com.faik.Controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faik.Controller.RestEmployeeController;
import com.faik.Dto.DtoEmployee;
import com.faik.Service.IEmployeeService;
import com.faik.Service.Impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl implements RestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeService.findEmployeeById(id);
	}

}
