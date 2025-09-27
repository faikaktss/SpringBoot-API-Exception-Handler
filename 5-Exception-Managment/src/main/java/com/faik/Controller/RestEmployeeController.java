package com.faik.Controller;

import com.faik.Dto.DtoEmployee;

public interface RestEmployeeController {

	public DtoEmployee findEmployeeById(Long id);
}
