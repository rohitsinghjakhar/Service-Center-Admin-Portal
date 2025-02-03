package com.admin.adminportal.validator;

import org.springframework.stereotype.Component;

@Component
public class Validate {

    public boolean validMobNum(String mobNumber)
    {
        return mobNumber.length()<=10;
    }
}
