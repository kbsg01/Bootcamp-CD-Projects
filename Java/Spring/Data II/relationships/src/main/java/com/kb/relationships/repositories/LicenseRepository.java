package com.kb.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kb.relationships.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
    List<License> findAll();
}
