package com.myfirsttest.testing.Controller;

import com.myfirsttest.testing.Model.Credential;
import com.myfirsttest.testing.Model.User;
//import com.myfirsttest.testing.Service.CustomUserDetailsService;
import com.myfirsttest.testing.Repository.UserRepository;
import com.myfirsttest.testing.Service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import javax.validation.Valid;
import java.util.List;


/*
!!
NEED HTML FOR EACH /***
!!
 */
@RestController
@RequestMapping("/login")
@Controller
    public class LoginController {
        @Autowired
        private CustomUserDetailsService customUserDetailsService;
        private UserRepository uR;

        // get list of all users
        private List<User> users = customUserDetailsService.getAllUsers();

        //view method for login page
        @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
        public ResponseEntity<String> authenticate(@RequestBody Credential user) {
            // find user
            User test = uR.findByUserAndPass(user.getUsername(), user.getPassword());
            // if not found say so
            if (test == null){
                return ResponseEntity.badRequest().body("Username or password is incorrect");
            }
            // if found, create token and return
            String token = "jwt-token";
            return ResponseEntity.ok(
                    "id:" + test.getId()+
                    "username:"+ test.getUsername()+
                    "firstName:"+ test.getFname()+
                    "lastName"+ test.getLname()+
                    "token"+ token
            );
        }

        //Save user when form is submitted
        @RequestMapping(value = "/register", method = RequestMethod.POST)
        public ResponseEntity<String> register(@Valid User user) {
            User userExists = customUserDetailsService.findByUsername(user.getUsername());
            if (userExists != null) {
                return ResponseEntity.badRequest().body("Username \"" + user.getUsername() + "\" is already taken");
            }
            customUserDetailsService.updateUser(user);
            return ResponseEntity.ok("Registration successful.");
        }

//        ///view method for user dashboard page which is a secure page
//        //that will show data from the successful login.
//        @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
//        public ModelAndView dashboard() {
//            ModelAndView modelAndView = new ModelAndView();
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            User user = customUserDetailsService.getUserByEmail(auth.getName());
//            modelAndView.addObject("currentUser", user);
//            modelAndView.addObject("userMessage", "Content Available Only for people who login");
//            modelAndView.setViewName("dashboard");
//            return modelAndView;
//        }

}

        /*
        @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
        public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
                                      @RequestParam(value = "logout",	required = false) String logout) {

            ModelAndView model = new ModelAndView();
            if (error != null) {
                model.addObject("error", "Invalid Credentials provided.");
            }

            if (logout != null) {
                model.addObject("message", "Logged out from JournalDEV successfully.");
            }

            model.setViewName("loginPage");
            return model;
        }
         */



