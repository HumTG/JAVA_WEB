package org.example.demospingboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String index(){
        return "index";  // index.jsp
    }

}
