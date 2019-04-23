package com.pawelk.springDeployTomcat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {

    @RequestMapping("/")
    public String home(){
        return "Hello, here is sample app deploy on tomcat serve 8.5";
    }
}
