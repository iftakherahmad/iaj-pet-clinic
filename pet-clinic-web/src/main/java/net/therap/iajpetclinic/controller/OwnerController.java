package net.therap.iajpetclinic.controller;

import net.therap.iajpetclinic.model.Owner;
import net.therap.iajpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Controller
@RequestMapping("/owners/")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","","/index","/index.html"})
    public String listOwners(Model model){
        Set<Owner> owners=ownerService.findAll();
        model.addAttribute("owners",owners);
        return "owners/index";
    }

    @RequestMapping({"/find"})
    public String findOwners(Model model){
        return "notImplemented";
    }
}