/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.hellojsf.controller;

import edu.gju.hellojsf.entities.Student;
import edu.gju.hellojsf.service.StudentsService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hesham
 */
@ManagedBean
public class StudentListController {

    @ManagedProperty("#{studentBean}")
    private StudentsService studentService;

    private List<Student> students;

    // Object to bind to form component data
    private Student studentObject = new Student();

    @PostConstruct
    public void loadStudents() {
        students = studentService.findAll();
    }

    public void save() {
        studentService.save(this.studentObject);
    }

    public Student getStudentObject() {
        return studentObject;
    }

    public void setStudentObject(Student studentObject) {
        this.studentObject = studentObject;
    }

    public StudentsService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentsService studentService) {
        this.studentService = studentService;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
