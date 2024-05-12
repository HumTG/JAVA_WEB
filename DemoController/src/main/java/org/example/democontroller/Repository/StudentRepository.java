package org.example.democontroller.Repository;

import org.example.democontroller.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> lists = new ArrayList<>();

    public StudentRepository() {
        lists.add(new Student(1,"Hùng 0","dh2k4k@gmail.com"));
        lists.add(new Student(2,"Hùng 1","dh2k5k@gmail.com"));
        lists.add(new Student(3,"Hùng 2","dh2k6k@gmail.com"));
        lists.add(new Student(4,"Hùng 3","dh2k7k@gmail.com"));

    }

    public List<Student> getAllDataStudent(){
        return lists;
    }
}
