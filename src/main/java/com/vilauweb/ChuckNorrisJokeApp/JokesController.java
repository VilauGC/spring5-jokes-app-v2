package com.vilauweb.ChuckNorrisJokeApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService service;

    public JokesController(JokesService service) {
        this.service = service;
    }

    @RequestMapping(value = "")
    public String getJokes(Model model) {
        model.addAttribute("joke", this.service.getJokes());
        return "index";
    }

}
