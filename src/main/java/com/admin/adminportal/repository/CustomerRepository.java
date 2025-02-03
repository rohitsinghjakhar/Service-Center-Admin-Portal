package com.admin.adminportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.admin.adminportal.model.Customer;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
   public Customer findByCustomerId(String customerId);
   @Query(value = "SELECT * FROM customer WHERE customer_name = :customerName", nativeQuery = true)
   public Customer getDetailsByCustomerName(@Param("customerName") String customerName);
   @Query("select customerName,customerId from Customer customer where mobileNumber=:mobileNumber")
   public Object[] getNameAndIdByMobileNumber(@Param("mobileNumber") String mobileNumber);
   @Query("select new Customer(customerName,address) from Customer customer where customer.mobileNumber=:mobileNumber")
   public Customer getNameAndAddressByMobileNumber(@Param("mobileNumber") String mobileNumber);

   Customer findByMobileNumber(String mobileNumber);

   Customer findByCustomerName(String customerName);
}
