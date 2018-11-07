package be.busi.pizzaland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping(value = "/client")
public class UserController {


    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("welcome", "WelcomePage");

        return "integrated:userHomePage";
    }
}
