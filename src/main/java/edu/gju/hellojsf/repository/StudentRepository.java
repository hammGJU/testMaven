/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.hellojsf.repository;

import edu.gju.hellojsf.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hesham
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
