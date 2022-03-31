package com.demo.MockOnInterface.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.MockOnInterface.Entities.MockCustomer;


@Repository
public interface MockRepository extends JpaRepository<MockCustomer, Integer>   {
	
	
	@Query("Select s FROM MockCustomer s")
	List<MockCustomer> getall();

}
