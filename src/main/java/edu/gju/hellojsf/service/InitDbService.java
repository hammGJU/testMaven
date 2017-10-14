/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.hellojsf.service;

import edu.gju.hellojsf.entities.Student;
import edu.gju.hellojsf.repository.StudentRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hesham
 */
@Service
public class InitDbService {

    @Autowired
    private StudentRepository studentRepository;

    //this will be called when the bean created, upon application start up.
    @PostConstruct
    public void init() {
        System.out.println("Init method started!\n");
        Student s1 = new Student();
        s1.setFirstName("Hesham");
        s1.setSchool("EEIT");
        studentRepository.save(s1);
        System.out.println("Init method finished!\n");

    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

}
