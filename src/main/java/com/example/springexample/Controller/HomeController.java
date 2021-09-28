package com.example.springexample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome()
    {
        return "Welcome to java OpenShift";
    }

    @GetMapping("/{input}")
    public String congrats(@PathVariable String input)
    {
        return "hi" + input + "Your application deploy Success .....";
    }
}
