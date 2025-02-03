package com.admin.adminportal.controller;

import com.admin.adminportal.model.Customer;
import com.admin.adminportal.model.RequestModel;
import com.admin.adminportal.model.ResponseModel;
import com.admin.adminportal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public ResponseEntity<Customer> customerInfo(@RequestBody Customer customer){
        Customer customer1=adminService.customerInfo(customer);
        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }
    @GetMapping("/getdetailsbycustomerid/{customerId}")
    public ResponseEntity<Customer> getCustomerByCustomerId(@PathVariable String customerId){
           Customer customer2= adminService.getCustomerByCustomerId(customerId);
           return new ResponseEntity<>(customer2,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id){
        Customer customer=adminService.getCustomerById(id);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    @GetMapping("/name/{customerName}")
    public ResponseEntity<Customer> getCustomerByCustomerName(@PathVariable("customerName") String customerName){
        Customer customer3=adminService.getCustomerByCustomerName(customerName);
        return new ResponseEntity<>(customer3,HttpStatus.OK);
    }
    @GetMapping("/mob/{mobileNumber}")
    public ResponseEntity<Object[]> getNameAndCustomerIdByMobileNumber(@PathVariable String mobileNumber){
       Object[] nameAndId= adminService.getNameAndCustomerIdByMobileNumber(mobileNumber);
       return new ResponseEntity<>(nameAndId,HttpStatus.OK);
    }
    @GetMapping("/NameAndAddress/{mobileNumber}")
    public ResponseEntity<Customer> getNameAndAddressByMobileNumber(@PathVariable String mobileNumber){
        Customer customer=adminService.getNameAndAddressByMobileNumber(mobileNumber);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    @PostMapping("/save/customerAndProduct")
    public ResponseEntity<ResponseModel> saveCustAndProdInfo(@RequestBody RequestModel requestModel){
        ResponseModel responseModel=adminService.saveCustAndProdInfo(requestModel);
        return new ResponseEntity<>(responseModel,HttpStatus.OK);
    }

    @GetMapping("/getCustomerByMobile/{mobileNumber}")
    public Customer getCustomerByMobile(@PathVariable String mobileNumber) {
        return adminService.getMobileNumber(mobileNumber);
    }


}
