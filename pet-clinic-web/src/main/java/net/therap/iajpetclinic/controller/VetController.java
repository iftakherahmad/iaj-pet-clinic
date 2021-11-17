package net.therap.iajpetclinic.controller;

import net.therap.iajpetclinic.model.Vet;
import net.therap.iajpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/","/vets.html","/vets/index","/vets/index.html"})
    public String listVets(Model model){
        Set<Vet> vets=vetService.findAll();
        model.addAttribute("vets",vets);
        return "vets/index";
    }
}