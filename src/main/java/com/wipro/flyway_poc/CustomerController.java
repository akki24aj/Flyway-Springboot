package com.wipro.flyway_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    
    
    @RequestMapping(path = "/customers/", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    
    @RequestMapping(path = "/customers/{customerId}/contacts/", method = RequestMethod.GET)
    public Optional<Customer> getCustomerContacts(@PathVariable("customerId") Long customerId) {
        return customerRepository.findById(customerId);
    }
}