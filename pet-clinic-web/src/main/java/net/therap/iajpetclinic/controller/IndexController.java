package net.therap.iajpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Controller
public class IndexController {

    @RequestMapping({"/",""})
    public String index(Model model){
        return "index";
    }
}