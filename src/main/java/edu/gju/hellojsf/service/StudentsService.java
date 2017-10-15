/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.hellojsf.service;

import edu.gju.hellojsf.entities.Student;
import edu.gju.hellojsf.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hesham
 */
@Service("studentBean")
public class StudentsService {

    @Autowired
    private StudentRepository studentReposiory;

    public List<Student> findAll() {
        return studentReposiory.findAll();
    }

    public StudentRepository getStudentReposiory() {
        return studentReposiory;
    }

    public void setStudentReposiory(StudentRepository studentReposiory) {
        this.studentReposiory = studentReposiory;
    }

    public void save(Student student) {
        studentReposiory.save(student);
    }

}
