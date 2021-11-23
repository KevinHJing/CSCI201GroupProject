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
        savedCustomer.setLastName(customer.getLastName());
        savedCustomer.setFirstName(customer.getFirstName());

        customerRepository.save(savedCustomer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerByName(String firstname){
        return customerRepository.findByName(firstname).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Customer by ID %s", firstname)));
    }

    public void deleteCustomer(String id){
        customerRepository.deleteById(id);
    }
}
