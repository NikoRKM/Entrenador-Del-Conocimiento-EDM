package ar.edu.unju.edm.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class infoController {

    @GetMapping("/contact")
    public String getContact() {

        return "contact";
    }
    
    @GetMapping("/news")
    public String getNews() {

        return "news";
    }
}