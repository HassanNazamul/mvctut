package mvc.mvctut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mvc.mvctut.entity.User;


@Controller
public class MyController {


    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping("/submit")
    @ResponseBody
    public String submit(@ModelAttribute User user) {


        return "submited data " + user.getFname() ; 
    }
    
}
