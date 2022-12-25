package com.sanam.configconsumer.configconsumer.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment  environment;


    // this is to get the properties from application.yml in git hub repo
    public String getDefaultModel(){
        return environment.getProperty("vehicle.default.model");
    }

    public String getMinRentPeriod(){

        return  environment.getProperty("member.rent.min");
    }
}
