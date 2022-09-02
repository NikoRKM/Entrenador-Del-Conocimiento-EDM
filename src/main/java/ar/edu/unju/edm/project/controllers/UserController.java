package ar.edu.unju.edm.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/inscription")
	public String inscribeUser(){

        return "inscription";
    }

    @GetMapping("/matriculation")
    public String matriculateUser(){

        return "matriculation";
    }

    @GetMapping("/contact")
    public String getContact(){

        return "contact";
    }

    @GetMapping("/recreationalActivities")
    public String getRecreationalActivities(){

        return "recreationalActivities";
    }

    @GetMapping("/studyMaterial")
    public String getStudyMaterial(){

        return "studyMaterial";
    }
}