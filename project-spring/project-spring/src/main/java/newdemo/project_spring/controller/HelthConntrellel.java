package newdemo.project_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthConntrellel {

    @GetMapping("/helth")
    public String helthCheck(){
        return "ok";
    }
}
