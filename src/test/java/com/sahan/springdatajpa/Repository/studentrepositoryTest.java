package com.sahan.springdatajpa.Repository;

import com.sahan.springdatajpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class studentrepositoryTest {

    @Autowired
    private Studentrepository studentrepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailAddress("sahan@gmail.com")
                .build();
        //studentrepository.save(student);
        studentrepository.deleteAll();
    }
    @Test
    public void printAllStudnets(){
        List<Student> studentList = studentrepository.findAll();
        System.out.println(studentList);
    }
}