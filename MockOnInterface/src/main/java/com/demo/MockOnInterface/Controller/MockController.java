package com.demo.MockOnInterface.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.MockOnInterface.Entities.MockCustomer;
import com.demo.MockOnInterface.Service.MockService;

@RestController
@RequestMapping("/Mock")
public class MockController {
	
	
	@Autowired
	MockService mockService;
	
	@GetMapping("/getall")
	public List<MockCustomer> getall()
	{
		return mockService.getall();
	}

}
