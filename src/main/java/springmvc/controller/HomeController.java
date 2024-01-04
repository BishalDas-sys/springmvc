package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springmvc.entity.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage( Model model) {
        System.out.println("Home page is getting Loaded");
        model.addAttribute("message", "Hello World");
        List<String> friends = new ArrayList<String>();
        friends.add("Rekhav");
        friends.add("Rahul");
        friends.add("Vivek");
        model.addAttribute("friends", friends);

        return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView getAboutPage() {
        System.out.println("About page is getting Loaded");
        ModelAndView model = new ModelAndView();
        model.addObject("message", "This is the About Page");

        Map<String, Integer>  students = new HashMap<>();

        students.put("Rekhav", 92);
        students.put("Rahul", 93);
        students.put("Vivek", 94);
        model.addObject("students", students);
        model.setViewName("about");
        return model;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContactPage() {
        System.out.println("Contact page is getting Loaded");
        return "contact";
    }

//    @RequestMapping(value = "/processform", method = RequestMethod.POST)
//    public String getprocessForm(@RequestParam("form-email") String email, @RequestParam("form-password") String password, Model model) {
//        User user = new User();
//        user.setEmail(email);
//        user.setPassword(password);
//
//        System.out.println(user);
//
//        model.addAttribute(user);
//        return "";
//    }

    @RequestMapping(value = "/processform", method = RequestMethod.POST)
    public String getprocessForm(@ModelAttribute User user) {
        return "";
    }
}
