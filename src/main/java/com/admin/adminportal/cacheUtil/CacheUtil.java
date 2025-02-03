package com.admin.adminportal.cacheUtil;

import com.admin.adminportal.model.Customer;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@Component
public class CacheUtil {
    private Map<String, Customer> cacheMap;

    @PostConstruct
    public void init() {
        cacheMap = new ConcurrentHashMap<>();
    }

    public boolean isKeyPresent(String mobileNumber) {
        return cacheMap.containsKey(mobileNumber);
    }

    public Customer getValue(String mobileNumber) {
        return cacheMap.get(mobileNumber);
    }

    public void insert(String mobileNumber, Customer customer) {
        cacheMap.put(mobileNumber, customer);
    }
}
