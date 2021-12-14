package com.myfirsttest.testing.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfirsttest.testing.Service.CustomUserDetailsService;
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


    private final CustomUserDetailsService customUserDetailsService;

    public UserController(CustomUserDetailsService customUserDetailsService){
        this.customUserDetailsService = customUserDetailsService;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable String id){
        customUserDetailsService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(customUserDetailsService.getAllUsers());
    }




}

/*
@GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username){
        return ResponseEntity.ok(userService.getUserByName(username));
    }
 */



