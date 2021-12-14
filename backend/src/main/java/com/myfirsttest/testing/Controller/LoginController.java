package com.myfirsttest.testing.Controller;

import com.myfirsttest.testing.Model.User;
//import com.myfirsttest.testing.Service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;


/*
!!
NEED HTML FOR EACH /***
!!
 */

@Controller
    public class LoginController {
//        @Autowired
//        private CustomUserDetailsService customUserDetailsService;
//
//        //view method for login page
//        @RequestMapping(value = "/login", method = RequestMethod.GET)
//        public ModelAndView login() {
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.setViewName("login");
//            return modelAndView;
//        }
//
//        //view method for Register/signup page
//        @RequestMapping(value = "/signup", method = RequestMethod.GET)
//        public ModelAndView signup() {
//            ModelAndView modelAndView = new ModelAndView();
//            User user = new User();
//            modelAndView.addObject("user", user);
//            modelAndView.setViewName("signup");
//            return modelAndView;
//        }
//
//        //Save user when form is submitted
//        @RequestMapping(value = "/signup", method = RequestMethod.POST)
//        public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
//            ModelAndView modelAndView = new ModelAndView();
//            User userExists = customUserDetailsService.getUserByEmail(user.getEmail());
//            if (userExists != null) {
//                bindingResult
//                        .rejectValue("email", "error.user",
//                                "There is already a user registered with the email provided");
//            }
//            if (bindingResult.hasErrors()) {
//                modelAndView.setViewName("signup");
//            } else {
//                customUserDetailsService.updateUser(user);
//                modelAndView.addObject("successMessage", "User has been registered successfully");
//                modelAndView.addObject("user", new User());
//                modelAndView.setViewName("login");
//
//            }
//            return modelAndView;
//        }
//
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
//
//        //view method for initial page
//        @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
//        public ModelAndView home() {
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.setViewName("home");
//            return modelAndView;
//        }
//
//
//        //used by user to perform normal user activities
//        @RequestMapping(value = {"/userPage"}, method = RequestMethod.GET)
//        public ModelAndView userPage() {
//            ModelAndView model = new ModelAndView();
//            model.setViewName("userPage");
//            return model;
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



