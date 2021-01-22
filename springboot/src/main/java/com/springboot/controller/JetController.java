package com.springboot.controller;

import com.springboot.MainApplication;
import com.springboot.bean.Jet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.xml.ws.RequestWrapper;

@RestController
public class JetController {

    @Resource(name="myjet-com.springboot.bean.Jet")
    Jet jet;

    @RequestMapping("/jet")
    public Jet getJet() {
        System.out.println("jet = " + jet);
        return jet;
    }
}
