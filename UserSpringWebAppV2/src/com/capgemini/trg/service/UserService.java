package com.capgemini.trg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.trg.dao.IUserDAO;
import com.capgemini.trg.dao.UserDAO;
import com.capgemini.trg.entity.User;
import com.capgemini.trg.exception.UserException;
@Service
@Transactional
public class UserService implements IUserService{
	/*private IUserDAO userDAO=new UserDAO();
	*/
	@Autowired
	private IUserDAO userDAO;
	@Override
	public User getUserDetails(Integer userid) throws UserException {
		// TODO Auto-generated method stub
		return userDAO.getUserDetails(userid);
	}

	@Override
	public Boolean isValidUser(String username, String password) throws UserException {
			return userDAO.isValidUser(username, password);
	}

	@Override
	public Integer addUserDetails(User user) throws UserException {
		// TODO Auto-generated method stub
		return userDAO.addUserDetails( user);
	}

}
