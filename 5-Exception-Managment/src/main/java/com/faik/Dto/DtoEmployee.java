package com.faik.Dto;

import lombok.Data;

@Data
public class DtoEmployee {

	private Long id;
	
	private String name;
	
	private DtoDepartment dtoDepartment;
}
