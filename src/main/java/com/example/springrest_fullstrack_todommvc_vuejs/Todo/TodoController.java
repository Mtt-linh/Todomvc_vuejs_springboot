package com.example.springrest_fullstrack_todommvc_vuejs.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping("/")
    public  String list(){ return "todo";}
}
