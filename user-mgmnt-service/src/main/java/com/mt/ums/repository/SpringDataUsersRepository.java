package com.mt.ums.repository;

import org.springframework.data.repository.CrudRepository;

import com.mt.ums.domin.entity.Users;

/**
 * @author m1015830
 */
public interface SpringDataUsersRepository extends CrudRepository<Users, Long> {

	Users findUsersById(Long userId);

}
