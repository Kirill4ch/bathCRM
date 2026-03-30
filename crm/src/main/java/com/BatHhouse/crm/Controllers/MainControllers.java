package com.BatHhouse.crm.Controllers;

import com.BatHhouse.crm.ForRepo.ApplicationsDTO;
import com.BatHhouse.crm.ForRepo.Customer;
import com.BatHhouse.crm.ForRepo.BathDTO;
import com.BatHhouse.crm.Repositories.ApplicationsRepo;
import com.BatHhouse.crm.Repositories.BathRepo;
import com.BatHhouse.crm.Repositories.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

@Slf4j
@RestController
public class MainControllers {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private CustomerRepo clientRepo;
    @Autowired
    private BathRepo bathRepo;
    @Autowired
    private ApplicationsRepo applicationsRepo;
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/api/addCustomer")
    public Customer addCustomer(@RequestBody Customer b){
        log.info("new row" + b.toString());
        Customer saved = clientRepo.save(b);
        return saved;

    }
    @PostMapping("/api/addBath")
    public BathDTO addBath(@RequestBody BathDTO b){
        log.info("new row" + b.toString());
        BathDTO saved = bathRepo.save(b);
        return saved;
    }
    @PostMapping("/api/addApplication")
    public ApplicationsDTO addApp(@RequestBody ApplicationsDTO b){
        log.info("new row" + b.toString());
        ApplicationsDTO saved = applicationsRepo.save(b);
        return saved;
    }

    @GetMapping("/user/govno/{email}")
    public Customer getUser(@PathVariable String email) {
        return customerRepo.findByEmailNative(email);
    }

}
