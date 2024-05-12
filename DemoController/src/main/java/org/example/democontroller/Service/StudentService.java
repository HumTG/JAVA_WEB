package org.example.democontroller.Service;

import org.example.democontroller.Entity.Student;
import org.example.democontroller.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository ;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll(){
        return studentRepository.getAllDataStudent();
    }

}
