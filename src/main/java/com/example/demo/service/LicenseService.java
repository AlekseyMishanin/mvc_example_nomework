package com.example.demo.service;

import com.example.demo.entity.License;
import com.example.demo.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    private LicenseRepository licenseRepository;

    @Autowired
    public void setLicenseRepository(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public License findById(Long id){return licenseRepository.findById(id).get();}

    public Iterable<License> findAll(){return licenseRepository.findAll();}
}
