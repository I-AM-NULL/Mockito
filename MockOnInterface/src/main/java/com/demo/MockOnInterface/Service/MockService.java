package com.demo.MockOnInterface.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MockOnInterface.Entities.MockCustomer;
import com.demo.MockOnInterface.Repository.MockRepository;

@Service
public class MockService {
	
	@Autowired
	MockRepository mockRepository;
	
	
	
	public MockRepository getMockRepository() {
		return mockRepository;
	}



	public void setMockRepository(MockRepository mockRepository) {
		this.mockRepository = mockRepository;
	}



	public List<MockCustomer> getall()
	{
		return mockRepository.getall();
		
	}


}
