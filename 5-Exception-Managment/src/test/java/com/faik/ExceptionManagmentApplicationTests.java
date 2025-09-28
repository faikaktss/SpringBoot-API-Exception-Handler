package com.faik;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.faik.Dto.DtoEmployee;
import com.faik.Service.IEmployeeService;
import com.faik.Starter.ExceptionManagmentApplicationStarter;

@SpringBootTest(classes = {ExceptionManagmentApplicationStarter.class})
class ExceptionManagmentApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	
	//Her zaman test metodundan önce çalışır
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each metodu çalıştı");
	}
	

	
	@Test
	public void testFindemployeeById() {
		DtoEmployee dtoEmployee = employeeService.findEmployeeById(1L);
		assertNotNull(dtoEmployee); // Değer null ise bana hata ver demek
	}
	
	
	// Test metodundan sonra çalışır
	@AfterEach
	public void afterEach() {
		System.out.println("Aftereach metodu çalıştı");
	}

}
