package com.training.jpapractise.service;

import com.training.jpapractise.model.Student;
import com.training.jpapractise.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements  StudentService{
    @Autowired
    private StudentRepository stdRepository;
    @Override
    public List<Student> getAll() {
        return stdRepository.findAll();
    }

    @Override
    public Student addstudent(Student std) {
        return stdRepository.save(std);
    }

    @Override
    public Student updatestudent(Student std) {
        Student std1 = stdRepository.getById(std.getId());
        if (std.getName()!=null)
            std1.setName(std.getName());
        if (std.getRoll_no()!=null)
            std1.setRoll_no(std.getRoll_no());
        return stdRepository.save(std1
        );
    }

    @Override
    public String deletestudent(Long id) {
        stdRepository.deleteById(id);
        return "DeleteSuccessFully";
    }

}
