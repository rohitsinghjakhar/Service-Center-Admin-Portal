package com.admin.adminportal.model;

import org.springframework.stereotype.Component;

@Component
public class ValidityCheck {
    public boolean isBrandValid(String brandName){
        return "sony".equalsIgnoreCase(brandName);
    }
}
