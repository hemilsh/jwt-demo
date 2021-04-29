package com.intentlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intentlabs.model.DAOUser;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

}