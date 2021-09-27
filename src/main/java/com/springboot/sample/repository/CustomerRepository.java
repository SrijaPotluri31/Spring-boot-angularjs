package com.springboot.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sample.model.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, String>{

}
