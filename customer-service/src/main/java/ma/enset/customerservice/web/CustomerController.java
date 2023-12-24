package ma.enset.customerservice.web;

import ma.enset.customerservice.entities.Customer;
import ma.enset.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping("/customers")
    @ResponseBody
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<Customer> customers(){
        List<Customer> customerList= customerRepository.findAll();

        return customerList;
    }


}
