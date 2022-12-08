package com.kb.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kb.relationships.models.Person;
import com.kb.relationships.services.PersonService;

@Controller
@RequestMapping("persons")
public class PersonController {
    // Atributos
    // Injeccion de dependencias
    private final PersonService pService;

    // Constructor
    public PersonController(PersonService pService){
        this.pService = pService;
    }

    // Metodos

    //Ruta get para  formulario de personas
    // @ModelAtributes vilcula un modelo vacio al formulario de persona
    @GetMapping("new")
    public String  newPerson(@ModelAttribute("person")Person person){
        return "persons/new";
    }

    // Ruta get para mostrar una persona
    @GetMapping("{id}")
    public String showPerson(@PathVariable("id")Long id, Model model){
        Person person = pService.findPerson(id);
        model.addAttribute("person", person);

        return "persons/show";
    }


    // Ruta Post para agregar una persona nueva
    @PostMapping("new")
    // La anotacion @Valid revisa si el objeto enviado pasa la validacion
    // @BindingResult debe ir despues de la anotacion @Valid. Esto le dice a la aplicacion que busque errores.
    public String addPerson(@Valid @ModelAttribute("person")Person person, BindingResult result){
        // Manejo de eventos para chequear errores
        if(result.hasErrors()){
            return "persons/new";
        } else {
            pService.create(person);
            return "redirect:/persons/new";
        }
    }
}
