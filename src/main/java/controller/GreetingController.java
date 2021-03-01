package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/hello")
    public ModelAndView greet() {
        ModelAndView modelAndView = new ModelAndView("helloworld");
        modelAndView.addObject("greet", "Hello world!");
        return modelAndView;
    }


}
