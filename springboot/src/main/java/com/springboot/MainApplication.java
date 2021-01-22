package com.springboot;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.springboot.bean.*;
import com.springboot.config.Myconfig;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import javax.inject.Inject;
import java.util.Arrays;


/**
 * 默认主程序所在的包和子package下的文件都能被扫描到
 * 想要改变扫描路径，需要修改@SpringBootApplication(scanBasePackages="xx.xxx")
 * 或者使用@ComponentScan(),把分解为
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan("xx.xxx")
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1. 返回IOC容器
        ConfigurableApplicationContext config =
                SpringApplication.run(MainApplication.class, args);

        // 2. 查看容器里面的组件
        String[] names = config.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println("name = " + name);
        }

        // 3. 从容器中获取组件
        //@Configuration(proxyBeanMethods = true)获取到的就是代理对象
        Pet tom1 = config.getBean("Tom", Pet.class);
        Pet tom2 = config.getBean("Tom", Pet.class);
        System.out.println(tom1 == tom2);

        // 4.com.springboot.config.Myconfig$$EnhancerBySpringCGLIB$$a286717@6b9c69a9
        Myconfig bean = config.getBean(Myconfig.class);
        System.out.println(bean);

        User user1 = config.getBean("myuser", User.class);
        Pet tom3 = config.getBean("Tom", Pet.class);
        System.out.println(user1.getPet() == tom3);

        HomeLander homeLander = config.getBean("HomeLander", HomeLander.class);
        System.out.println("homeLander = " + homeLander);

        Car car = config.getBean("car", Car.class);
        System.out.println("car = " + car);

        Jet jet = config.getBean("myjet-com.springboot.bean.Jet", Jet.class);
        System.out.println("jet = " + jet + "jet.class = " + jet.getClass());
    }
}
