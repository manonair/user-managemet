package com.mt.ums.repository;

import org.springframework.data.repository.CrudRepository;

import com.mt.ums.domin.entity.UserDetails;

/**
 * @author m1015830
 */
public interface SpringDataUserDetailsRepository extends CrudRepository<UserDetails, Long> {

	UserDetails findUserDetailsById(Long mapId);

}
