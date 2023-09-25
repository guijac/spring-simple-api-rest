package com.guijac.web;

import com.guijac.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class StudentController {

    public List<Student> students = 
        new ArrayList<>(Arrays.asList(new Student("Guilherme", "Cruz")
                    ,new Student("Jorge", "Aragão")));

    @GetMapping(path = "/students")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(students);  
    }

    @GetMapping(path = "/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return ResponseEntity.ok(students.get(id));
    }
        
    @PostMapping(path = "/students")
    public ResponseEntity<Student> newStudent(@RequestBody Student student) {
        students.add(student);
        return ResponseEntity.ok(student);            
    }

    @DeleteMapping(path = "/students/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int id) {
        students.remove(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/students/{id}")
    public ResponseEntity<?> updateStudentById(@RequestBody Student student, @PathVariable int id) {
        students.set(id, student);
        return ResponseEntity.ok(student);
    }
}