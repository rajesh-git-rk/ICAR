package com.icar.api.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icar.api.dao.Clientdao;
import com.icar.api.model.ClientTransaction;

@Repository
@Transactional
public class ClientdaoImpl implements Clientdao
{
//	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	

	@Override
	public List<ClientTransaction> getUserDetails(String username, String password) {
		System.out.println("dao impl----");
		List<ClientTransaction> list=entityManager.createQuery("from ClientTransaction where Email=:uname and password=:password").setParameter("uname",username).setParameter("password",password).getResultList();
		return list;
	}


	@Override
	public List<ClientTransaction> getAlldetails() {
		System.out.println("dao impl----");

		List<ClientTransaction> list=entityManager.createQuery("from ClientTransaction").getResultList();
		return list;
	}
	


}
