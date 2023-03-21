package controller;
import model.Customer;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public List<Customer> findAll(){
        return null;
    }
    
}
