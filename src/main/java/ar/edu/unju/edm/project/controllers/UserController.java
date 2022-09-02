package ar.edu.unju.edm.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

	@GetMapping("/inscription")
	public String inscribeUser(){

        return "null";
    }

    @GetMapping("/matriculation")
    public String matriculateUser(){

        return "null";
    }

    @GetMapping("/contact")
    public String getContact(){

        return "null";
    }

    @GetMapping("/recreationalActivities")
    public String getRecreationalActivities(){

        return "null";
    }

    @GetMapping("/studyMaterial")
    public String getStudyMaterial(){

        return "null";
    }
}