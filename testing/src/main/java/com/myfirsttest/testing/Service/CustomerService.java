package com.myfirsttest.testing.Service;

import com.myfirsttest.testing.Model.Customer;
import com.myfirsttest.testing.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer){
        customerRepository.insert(customer);
    }

    public void updateCustomer(Customer customer){
        Customer savedCustomer = customerRepository.findById(customer.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Customer by ID %s", customer.getId())));
        savedCustomer.setPassword(customer.getPassword());
        savedCustomer.setUsername(customer.getUsername());
        savedCustomer.setEmail(customer.getEmail());
        savedCustomer.setFname(customer.getFname());
        savedCustomer.setLname(customer.getLname());
        savedCustomer.setAge(customer.getAge());
        savedCustomer.setDriversLicense(customer.getDriversLicense());
        savedCustomer.setLikedListings(customer.getLikedListings());

        customerRepository.save(savedCustomer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerByName(String username){
        return customerRepository.findByUsername(username).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Customer by ID %s", username)));
    }

    public Customer getCustomerByPassword(String password){
        return customerRepository.findByUsername(password).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Customer by ID %s", password)));
    }

    public void deleteCustomer(String id){
        customerRepository.deleteById(id);
    }


}
