package com.rhiodamuthie.springbootin28m.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("in28Minutes")
                && password.equalsIgnoreCase("dummy");
    }

}
