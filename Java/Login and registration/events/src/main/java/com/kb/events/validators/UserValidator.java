package com.kb.events.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kb.events.models.User;

@Component
public class UserValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User u = (User) target;
        if(!u.getConfirmPassword().equals(u.getPassword())){
            errors.rejectValue("passwordConfirmation", "Match");
        }
        
    }
    
}
