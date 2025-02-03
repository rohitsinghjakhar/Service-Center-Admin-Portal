package com.admin.adminportal.service;
import com.admin.adminportal.model.Customer;
import com.admin.adminportal.model.RequestModel;
import com.admin.adminportal.model.ResponseModel;

public interface AdminService {
    public Customer customerInfo(Customer customer);

   public Customer getCustomerByCustomerId(String customerId);

   public Customer getCustomerById(int id);

   public Customer getCustomerByCustomerName(String customerName);

   public Object[] getNameAndCustomerIdByMobileNumber(String mobileNumber);

    Customer getNameAndAddressByMobileNumber(String mobileNumber);

    ResponseModel saveCustAndProdInfo(RequestModel requestModel);


    Customer getMobileNumber(String mobileNumber);
}
