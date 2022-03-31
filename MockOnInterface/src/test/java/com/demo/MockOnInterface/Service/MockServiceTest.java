package com.demo.MockOnInterface.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.MockOnInterface.Entities.MockCustomer;
import com.demo.MockOnInterface.Repository.MockRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class MockServiceTest {
	
	@Mock
	MockRepository mockRepository ;
	
	@InjectMocks // this annotation covers "mockService.setMockRepository(mockRepository);" action
	MockService mockService ;
	
	
	
	

	@Test
	void test() {
		
		MockCustomer mc1 = new MockCustomer();
		mc1.setId(1);
		mc1.setName("sai");
		List<MockCustomer> listOfInteger = new ArrayList<>();
		listOfInteger.add(mc1);
		
		
		Mockito.when(mockRepository.getall()).thenReturn(listOfInteger);
		System.out.println(mockRepository.getall());
		//mockService.setMockRepository(mockRepository);
		
		List<MockCustomer> actualIntegers  = mockService.getall();
		System.out.println("actualIntgers "+actualIntegers);
		System.out.println(actualIntegers.get(0).getName());
		
		
	}

}
