package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")

    public @ResponseBody   String firstRequest(){
        return "Hello world";

    }
    @PostMapping("/index")
     public String showIndex(){
       return  "THIS will never show";
    }

}
