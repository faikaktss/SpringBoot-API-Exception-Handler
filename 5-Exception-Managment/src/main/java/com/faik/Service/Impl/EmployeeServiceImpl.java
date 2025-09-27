package com.faik.Service.Impl;

import java.util.Optional;
import com.faik.Starter.ExceptionManagmentApplicationStarter;
import com.faik.exception.BaseException;
import com.faik.exception.ErrorMessage;
import com.faik.exception.MessageType;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faik.Dto.DtoDepartment;
import com.faik.Dto.DtoEmployee;
import com.faik.Model.Department;
import com.faik.Model.Employee;
import com.faik.Repository.EmployeeRepository;
import com.faik.Service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{


	@Autowired
	private EmployeeRepository employeeRepository;


	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDtoDepartment(dtoDepartment);
		
		return dtoEmployee;
	}

}

