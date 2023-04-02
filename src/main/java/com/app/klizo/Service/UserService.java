package com.app.klizo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.klizo.Entity.User;
import com.app.klizo.Repository.UserRepository;

@Service
public class UserService{

	@Autowired
	UserRepository repository;
	
	public String addSignupData(User bean){
        try{
        	repository.save(bean);

        }catch(Exception ex){
            return "Error occuring while inserting signup data!";

        }
        return "Signup data added.";
    }

    public java.util.List<User> getUserData(){

        return repository.findAll();
    }
	
}
