package com.kb.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kb.relationships.models.License;
import com.kb.relationships.models.Person;
import com.kb.relationships.services.LicenseService;
import com.kb.relationships.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class LicenseController {
    // Atributos
    // Injeccion de dependencias
    private final LicenseService lsService;
    private final PersonService pService;

    // Constructor
    public LicenseController(LicenseService lsService, PersonService pService) {
        this.lsService = lsService;
        this.pService = pService;
    }

    // Metodos

    @GetMapping("/")
    public String home(@ModelAttribute("person")Person person, @ModelAttribute("license") License license, Model model){
        List<Person> persons = pService.allPerson();
        List<License> licenses = lsService.allLisences();

        model.addAttribute("persons", persons);
        model.addAttribute("licences", licenses);

        return "index";
    }
    // Ruta Get para una nueva licencia
    @GetMapping("/new")
    // @ModelAttribute vilcula un modelo vacia al formulario de licencia
    public String newLicense(@ModelAttribute("license")License license, Model model){
        List<Person> persons = pService.allPerson();
        model.addAttribute("persons", persons);
        System.out.println("paso por get");
        return "licenses/new";
    }

    @PostMapping("/new")
    public String nuevaLicense(@Valid @ModelAttribute("licence")License license, BindingResult result, Model model){
        if(result.hasErrors()){
            return "licenses/new";
        } else {
            license.setNumber(String.format("%06d", lsService.allLisences().size()+1));
            lsService.createL(license);
            return "redirect:/licenses/new";
        }
    }

    // Ruta post que agrega una nueva licencia
    // @PostMapping("/new/a")
    // // La anotacion @Valid revisa si el objeto enviado pasa la validacion
    // // @BindingResult debe ir despues de la anotacion @Valid. Esto le dice a la aplicacion que busque errores.
    // public String addNewLicense(@ModelAttribute("license")License license, BindingResult result, Model model){
    //     // Manejo de eventos para chequear errores
    //     System.out.println("paso por aca0");
    //     if (result.hasErrors()) {
    //         List<Person> persons = pService.allPerson();
    //         model.addAttribute("person", persons);
    //         return "licenses/new";
    //     } else {
    //         license.setNumber(String.format("%06d", lsService.allLisences().size()+1));
    //         System.out.println("paso por aca1");
    //         lsService.createL(license);
    //         System.out.println("paso por aca2");
    //         return "redirect:/licenses/new/";
    //     }
    // }
}
