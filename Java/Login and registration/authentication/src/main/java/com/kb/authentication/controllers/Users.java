package com.kb.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kb.authentication.models.User;
import com.kb.authentication.services.UserService;
import com.kb.authentication.validator.UserValidator;


@Controller
public class Users {
    private final UserService userService;
    private final UserValidator userValidator;

    

    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage";
    }

    @RequestMapping("/login")
    public String login() {
        return "loginPage";
    }

    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        //si el resultado tiene errores, retornar a la página de registro (no se preocupe por las validaciones por ahora)
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "registrationPage";
        } 
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";
        
        //si no, guarde el usuario en la base de datos, guarde el id del usuario en el objeto Session y redirija a /home
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
        boolean isAuthenticated = userService.authenticateUser(email, password);
        if (isAuthenticated) {
            User u = userService.findByEmail(email);
            session.setAttribute("userId", u.getId());
            return "redirect:/home";
        } else{
            model.addAttribute("error", "Invalid Credentials. Please try again.");
            return "loginPage";
        }
    }

    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
        Long userId = (Long) session.getAttribute("userId");
        User u = userService.findUserById(userId);
        model.addAttribute("user", u);
        return "homePage";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidar la sesión
        session.invalidate();
        // redireccionar a la página de inicio de sesión.
        return "redirect:/login";
    }
}
