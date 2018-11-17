package com.capgemini.trg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.trg.entity.User;
import com.capgemini.trg.exception.UserException;
@Repository
public class UserDAO implements IUserDAO{
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public User getUserDetails(Integer userid) throws UserException {
		try{
			//entityManager=JPAUtil.getEntityManager();
			User user = entityManager.find(User.class,userid);
			return user;										
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new UserException(e.getMessage());
		}finally {
			//entityManager.close();
		}
	}

	@Override
	public Boolean isValidUser(String username, String password) throws UserException {
		String jql="select u from User u where u.username=:pname"
				+ " and u.password=:pwd";
		try{
			//entityManager=JPAUtil.getEntityManager();
			Query query= entityManager.createQuery(jql);
			query.setParameter("pname", username);
			query.setParameter("pwd", password);
			List<User> userList=query.getResultList();
			if(userList.size()==0) {
				return false;
			}else {
				return true;
			}											
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new UserException(e.getMessage());
		}finally {
			//entityManager.close();
		}
	}

	@Override
	public Integer addUserDetails(User user) throws UserException {
		try
		{
			//entityManager = JPAUtil.getEntityManager();
			//entityManager.getTransaction().begin();
			user.setUserid(null);
			entityManager.persist(user);
			//entityManager.getTransaction().commit();
			return 1 ;
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}
		finally
		{
		//entityManager.close();
		}
		
		
	}

}
