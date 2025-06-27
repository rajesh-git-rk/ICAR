package com.icar.api.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.icar.api.model.ClientTransaction;



@Service
public interface Clientdao {
	
	public List<ClientTransaction> getUserDetails(String username, String password);

	public List<ClientTransaction> getAlldetails();
	
	
	}


