package ar.edu.unju.edm.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class infoController {

    @GetMapping("/inscription")
    public String getInscription() {

        return "inscription";
    }

    @GetMapping("/matriculation")
    public String getMatriculation() {

        return "matriculation";
    }

    @GetMapping("/contact")
    public String getContact() {

        return "contact";
    }

    @GetMapping("/studyMaterial")
    public String getStudyMaterial() {

        return "studyMaterial";
    }
}