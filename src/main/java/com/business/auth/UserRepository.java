package com.business.auth;

import org.springframework.data.repository.CrudRepository;

import com.business.auth.user.User;

public interface UserRepository extends CrudRepository<User, Long>  {
	User findByEmail(String email);
}
