package repository;

import java.util.ArrayList;
import java.util.List;

import model.*;
public class CustomerRepository {

    private List<Customer> repository = new ArrayList<>();
    public List<Customer>findAll(){
        return repository;
    }
    
}
