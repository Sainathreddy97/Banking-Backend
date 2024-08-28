package com.authenticate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authenticate.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findAll();
}
