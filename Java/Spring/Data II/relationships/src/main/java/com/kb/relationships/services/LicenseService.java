package com.kb.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kb.relationships.models.License;
import com.kb.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
    
    private final LicenseRepository licenseRepo;

    public LicenseService(LicenseRepository licenseRepo){
        this.licenseRepo = licenseRepo;
    }


    public List<License> allLisences(){
        return licenseRepo.findAll();
    }

    public License createL(License li){
        return licenseRepo.save(li);
    }
}
