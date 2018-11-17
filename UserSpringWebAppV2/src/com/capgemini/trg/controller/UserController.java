package com.capgemini.trg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.trg.model.User;
import com.capgemini.trg.service.IUserService;

@Controller
@RequestMapping(value="/userc")

public class UserController {
	
@Autowired
private IUserService userService;
	@RequestMapping(value="/newuser",method=RequestMethod.GET)
	public ModelAndView showUserForm() {
		return new ModelAndView("add_user","user",new User());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView processForm( @Valid @ModelAttribute("user") User user,
			BindingResult result){
		
		try {
			if(result.hasErrors()) {
				List<ObjectError> errorList=result.getAllErrors();
				System.out.println(errorList);
				return new ModelAndView("add_user","user",new User());
			}else {
				System.out.println(user.getUsername()+","+user.getBirthdate());
				//persist into database, call service class method
				com.capgemini.trg.entity.User userE = new com.capgemini.trg.entity.User();
				populateUserE(userE,user);
				Integer n = userService.addUserDetails(userE);
				if(n>0)
				{
					return new ModelAndView("status","status","User added to database"); 
				}
				else
				{
					return new ModelAndView("status","status","unable to add in database"); 
				}	
				
			}
		} catch (Exception e) {			
			return new ModelAndView("status","status",e.getMessage()); 
		}		
		
	
}

	private void populateUserE(com.capgemini.trg.entity.User userE, User user) {
		userE.setUsername(user.getUsername());
		userE.setPassword(user.getPassword());
		userE.setEmailId(user.getEmailId());
		userE.setBirthdate(user.getBirthdate());
	}
	
	
	
	
	
	
	
	
	
	

}
