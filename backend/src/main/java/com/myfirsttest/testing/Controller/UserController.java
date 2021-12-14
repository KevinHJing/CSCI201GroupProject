package com.myfirsttest.testing.Controller;

//import com.myfirsttest.testing.Model.User;
//import com.myfirsttest.testing.Service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
//
//    private final CustomUserDetailsService customUserDetailsService;
//
//    public UserController(CustomUserDetailsService customUserDetailsService){
//        this.customUserDetailsService = customUserDetailsService;
//    }
    @GetMapping("/something")
    public String index() {
        return "Greetings from Spring Boot!\n";
    }

    @GetMapping("/")
    public String index2() {
        return "scrub\n";
    }

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



