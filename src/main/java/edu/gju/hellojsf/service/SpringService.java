/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gju.hellojsf.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author hesham
 */
@Service("springBean")
public class SpringService {

    public String helloSpring() {
        return "Hello from Spring service!!\n";
        
    }

}
