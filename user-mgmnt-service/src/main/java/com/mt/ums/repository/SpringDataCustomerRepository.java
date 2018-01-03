package com.mt.ums.repository;

import org.springframework.data.repository.CrudRepository;

import com.mt.ums.domin.entity.Customer;

/**
 * @author m1015830
 */
public interface SpringDataCustomerRepository extends CrudRepository<Customer, Long> {

	Customer findCustomerById(Long customerId);

}
