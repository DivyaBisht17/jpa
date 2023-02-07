package com.training.jpapractise.controller;

import com.training.jpapractise.model.Student;
import com.training.jpapractise.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/db")
@RestController

public class StudentController {
    @Autowired
    private StudentService stdService;
    @GetMapping("/getAll")
    public List<Student> getAll(){
        return  stdService.getAll();
    }

    @PostMapping("/addStd")
    public  Student addstudent(@RequestBody Student std){
        return  stdService.addstudent(std);
    }

    @PutMapping("/save")
    public   Student updatestudent(@RequestBody Student std){
        return  stdService.updatestudent(std);
    }
    @DeleteMapping("delete/{id}")
    public  String deletestudent(@PathVariable Long id){
        return  stdService.deletestudent(id);
    }

}
