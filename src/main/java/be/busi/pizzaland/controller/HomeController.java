package be.busi.pizzaland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/home")

public class HomeController {


    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("welcome", "WelcomePage");

        return "integrated:welcome";
    }

}
