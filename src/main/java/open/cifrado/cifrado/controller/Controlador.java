package open.cifrado.cifrado.controller;

import open.cifrado.cifrado.modelo.Persona;
import open.cifrado.cifrado.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private PersonaService service;

    @GetMapping(value = "/")
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping(value = "/addPersona")
    public String create(Model model) {
        model.addAttribute("personas", new Persona());
        return "addPersona";
    }

    @PostMapping("/addPersona")
    public String save(@Validated Persona p, Model model) {
        service.save(p);
        return "redirect:/index";
    }
}
