package ar.edu.unju.edm.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({ "/", "/index", "/home", "/menu" })
    public String getIndex() {
        return "index";
    }

    @GetMapping("/recreationalActivities")
    public String getRecreationalActivities() {

        return "recreationalActivities";
    }
}
