package com.icar.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icar.api.model.ClientTransaction;

public interface UserRepo extends JpaRepository<ClientTransaction, Integer>{


	
	

}
