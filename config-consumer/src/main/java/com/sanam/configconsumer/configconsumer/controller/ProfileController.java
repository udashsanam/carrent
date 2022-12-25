package com.sanam.configconsumer.configconsumer.controller;

import com.sanam.configconsumer.configconsumer.component.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {

    @Autowired
    private MemberProfileConfiguration memberProfileConfiguration;

    // we are getting the profile details
    @RequestMapping(method = RequestMethod.GET, value = "/profile")
    public MemberProfileConfiguration getConfile(){

        return memberProfileConfiguration;
    }

    // getting profile as html page

    @RequestMapping(value = "/profile/html", method = RequestMethod.GET)
    public String getProfileAshtml(Model model){
        model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());

        return "mprofile";
    }
}
