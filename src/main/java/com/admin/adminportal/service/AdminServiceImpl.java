package com.admin.adminportal.service;


import com.admin.adminportal.cacheUtil.CacheUtil;
import com.admin.adminportal.exception.InvalidBrandNameException;
import com.admin.adminportal.model.*;
import com.admin.adminportal.repository.CustomerRepository;
import com.admin.adminportal.repository.ProductRepository;
import org.hibernate.cache.spi.support.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    private ValidityCheck validityCheck;

    @Autowired
    private CacheUtil cacheUtil;

    @Override
    public ResponseModel saveCustAndProdInfo(RequestModel requestModel) {
        String customerId = generateCustomerId();
        requestModel.getCustomer().setCustomerId(customerId);
        String productCode = generateCustomerId() ;
        requestModel.getProduct().setProductCode(productCode);
        Customer customer = customerRepository.save(requestModel.getCustomer());
        Product product = productRepository.save(requestModel.getProduct());
        Boolean b = validityCheck.isBrandValid(product.getBrandName());
        if (b == true) {
            return ResponseModel.builder().
                    customerId(customer.getCustomerId()).
                    productCode(product.getProductCode()).build();
        } else {
                throw new InvalidBrandNameException("Services are not provided for the above brand");
        }
    }

    @Override
    public Customer customerInfo(Customer customer) {
            String customerId = generateCustomerId();
            customer.setCustomerId(customerId);
        return customerRepository.save(customer);
    }
    private String generateCustomerId() {
        Double randomnum = Math.random();
        String randomvalue = randomnum.toString().substring(2, 8);
        return randomvalue;
    }
    @Override
    public Customer getCustomerByCustomerId(String customerId) {
       return customerRepository.findByCustomerId(customerId);
    }
    @Override
    public Customer getCustomerById(int id) {
       Optional<Customer> customer= customerRepository.findById(id);
       return customer.get();
    }
    @Override
    public Customer getCustomerByCustomerName(String customerName) {
        return customerRepository.getDetailsByCustomerName(customerName);
    }

    @Override
    public Object[] getNameAndCustomerIdByMobileNumber(String mobileNumber) {
        return customerRepository.getNameAndIdByMobileNumber(mobileNumber);
    }

    @Override
    public Customer getNameAndAddressByMobileNumber(String mobileNumber) {
        return customerRepository.getNameAndAddressByMobileNumber(mobileNumber);
    }

    @Override
    public Customer getMobileNumber(String mobileNumber) {
        Customer customer = null;

        if (cacheUtil.isKeyPresent(mobileNumber)) {
            customer = cacheUtil.getValue(mobileNumber);
            System.out.println("Data Retrieved from Local Cache");
        } else {
            customer = customerRepository.findByMobileNumber(mobileNumber);
            cacheUtil.insert(mobileNumber, customer);
            System.out.println("Data Retrieved from Database");
        }

        return customer;
    }


    public Customer getCustomerByName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }


}
