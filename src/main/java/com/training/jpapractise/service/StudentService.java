package com.training.jpapractise.service;

import com.training.jpapractise.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();
    public  Student addstudent (Student std);
    public  Student updatestudent (Student std);
    public  String deletestudent (Long id);
}
