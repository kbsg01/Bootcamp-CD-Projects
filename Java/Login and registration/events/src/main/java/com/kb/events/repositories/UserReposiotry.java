package com.kb.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kb.events.models.User;

@Repository
public interface UserReposiotry extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
