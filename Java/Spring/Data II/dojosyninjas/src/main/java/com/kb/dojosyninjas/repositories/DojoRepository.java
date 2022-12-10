package com.kb.dojosyninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kb.dojosyninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
    List<Dojo> findAll();
}
