package com.faik.Service;

import com.faik.Dto.DtoEmployee;
import com.faik.Model.Employee;

public interface IEmployeeService {

	public DtoEmployee findEmployeeById(Long id);
}
