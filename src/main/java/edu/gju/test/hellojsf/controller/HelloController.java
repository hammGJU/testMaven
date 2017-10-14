package edu.gju.test.hellojsf.controller;

import edu.gju.hellojsf.service.SpringService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hesham
 */
@ManagedBean
@RequestScoped
public class HelloController {

    @ManagedProperty("#{springBean}")
    private SpringService springService;

    public String showHello() {
        return "Hello from Managed Bean!!";
    }

    public String springHello() {
        return springService.helloSpring();
    }

    public SpringService getSpringService() {
        return springService;
    }

    public void setSpringService(SpringService springService) {
        this.springService = springService;
    }

}
