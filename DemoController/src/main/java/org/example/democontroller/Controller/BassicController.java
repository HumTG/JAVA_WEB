package org.example.democontroller.Controller;

import org.example.democontroller.Entity.Student;
import org.example.democontroller.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BassicController {

    private final StudentService service ;

    public BassicController(StudentService service) {
        this.service = service;
    }

    @RequestMapping("/students")
    public String showStudent (Model model){
        model.addAttribute("listStudents",service.getAll());
        return "home";
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String sayHello(@RequestParam String name){
        return "hello " + name + "!" ;
    }


}
