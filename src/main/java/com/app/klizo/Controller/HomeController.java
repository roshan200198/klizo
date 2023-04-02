package com.app.klizo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.klizo.Entity.User;
import com.app.klizo.Service.UserService;

@RestController
public class HomeController {
	
    @Autowired
    UserService service;
    
    @RequestMapping(value = "/welcome")
    @CrossOrigin(origins = "*")
    public String welcome() {
        String txt = "user not authentocated to access this page";
        
        return txt;
    }

    @RequestMapping(method=RequestMethod.POST, value = "/savedata")
    @CrossOrigin(origins = "*")
    public String addUserContactus(@RequestBody User bean) {
        System.out.println("we are in controller!");

    

        return service.addSignupData(bean);
        //System.out.println("after controller!");

    }

    //To get contact us data
     @GetMapping("/viewdata")
     @CrossOrigin(origins = "*")
     public java.util.List<User> viewContact(User bean){
     return service.getUserData();
     }

}
