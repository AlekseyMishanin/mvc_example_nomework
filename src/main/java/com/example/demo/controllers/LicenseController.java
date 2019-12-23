package com.example.demo.controllers;

import com.example.demo.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/license")
public class LicenseController {

    private LicenseService licenseService;

    @Autowired
    public void setLicenseService(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping("")
    public String getLicense(Model model){

        model.addAttribute("licences", licenseService.findAll());
        return "license";
    }
}
