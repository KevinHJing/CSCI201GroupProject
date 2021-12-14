package com.myfirsttest.testing.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.myfirsttest.testing.Service.CustomUserDetailsService;
import com.myfirsttest.testing.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> employees = createList();
    private static List<User> createList() {
        List<User> tempEmployees = new ArrayList<>();
        User emp1 = new User();
        emp1.setFname("bob");

        User emp2 = new User();
        emp2.setLname("joe");
        return tempEmployees;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index(){
//        System.out.println("worked");
        return "hello";
    }


    @GetMapping("/something")
    public String index2(){
        return "test\n";
    }



//
//    private final CustomUserDetailsService customUserDetailsService;
//
//    public UserController(CustomUserDetailsService customUserDetailsService){
//        this.customUserDetailsService = customUserDetailsService;
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity updateUser(@RequestBody User user){
//        customUserDetailsService.updateUser(user);
//        return ResponseEntity.ok().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity deleteUser(@PathVariable String id){
//        customUserDetailsService.deleteUser(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//    @GetMapping
//    public ResponseEntity<List<User>> getAllUsers(){
//        return ResponseEntity.ok(customUserDetailsService.getAllUsers());
//    }
//
//    @GetMapping("/{email}")
//    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
//        return ResponseEntity.ok(customUserDetailsService.getUserByEmail(email));
//    }


}

/*
@GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username){
        return ResponseEntity.ok(userService.getUserByName(username));
    }
 */



