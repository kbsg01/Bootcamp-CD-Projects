package com.kb.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kb.events.models.UserEvent;

@Repository
public interface UserEventRepository extends CrudRepository<UserEvent, Long>{
    List<UserEvent> findAll();
}
