package com.myfirsttest.testing.Controller;

import com.myfirsttest.testing.Model.Customer;
import com.myfirsttest.testing.Service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{username}")
    public ResponseEntity<Customer> getCustomerByUsername(@PathVariable String username){
        return ResponseEntity.ok(customerService.getCustomerByName(username));
    }

    @GetMapping("/{password}")
    public ResponseEntity<Customer> getCustomerByPassword(@PathVariable String password){
        return ResponseEntity.ok(customerService.getCustomerByName(password));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
