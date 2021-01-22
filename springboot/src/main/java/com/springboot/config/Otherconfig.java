package com.springboot.config;

import com.springboot.bean.Car;
import com.springboot.bean.Jet;
import com.springboot.bean.Pet;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration

@EnableConfigurationProperties(Jet.class)
public class Otherconfig {

}
