package com.kb.events.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.kb.events.models.Event;
import com.kb.events.models.Message;
import com.kb.events.models.User;
import com.kb.events.repositories.EventRepository;
import com.kb.events.repositories.MessageRepository;
import com.kb.events.repositories.UserEventRepository;
import com.kb.events.repositories.UserReposiotry;

@Service
public class EventService {
    private final UserReposiotry userRepo;
    private final EventRepository eventRepo;
    private final MessageRepository messageRepo;
    private final UserEventRepository userEventRepo;
    
    public UserEventRepository getUserEventRepo() {
        return userEventRepo;
    }

    public EventService(UserReposiotry userRepo, EventRepository eventRepo, MessageRepository messageRepo,
            UserEventRepository userEventRepo) {
        this.userRepo = userRepo;
        this.eventRepo = eventRepo;
        this.messageRepo = messageRepo;
        this.userEventRepo = userEventRepo;
    }

    // Event
    public List<Event> allEvents(){
        return eventRepo.findAll();
    }

    public Event addEvent(Event event){
        return eventRepo.save(event);
    }

    public void deleteEvent(Long id){
        eventRepo.deleteById(id);
    }

    public Event findEventById(Long id){
        Optional<Event> e = eventRepo.findById(id);
        if (e.isPresent()) {
            return e.get();
        } else {
            return null;
        }
    }

    public void updateEvent(Event event){
        eventRepo.save(event);
    }

    // Message
    public Message addMessage(Message msg){
        return messageRepo.save(msg);
    }

    public void updateMsg(Message msg){
        messageRepo.save(msg);
    }

    public void newMessage(Message msg){
        messageRepo.save(msg);
    }

    // User
    public User registerUser(User user){
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepo.save(user);
    }

    public User findUserById(Long id){
        Optional<User> u = userRepo.findById(id);
        if (u.isPresent()) {
            return u.get();
        } else {
            return null;
        }
    }

    public User findByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public void updateUser(User user){
        userRepo.save(user);
    }

    // Autenticacion
    public boolean authenticateUser(String email, String password){
        User u = userRepo.findByEmail(email);
        if (u == null) {
            return false;
        } else {
            if (BCrypt.checkpw(password, u.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean duplicatedUser(String email){
        User u = userRepo.findByEmail(email);
        if (u == null) {
            return false;
        } else {
            return true;
        }
    }

}
