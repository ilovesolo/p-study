package com.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.springboot.bean.Jet;
import com.springboot.bean.Pet;
import com.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1. 配置类中使用@bean标注在方法上给容器注册组件，默认是单例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods：代理bean的方法
 *    * Full(proxyBeanMethods = true(默认))，配置类在容器保存代理对象，每次从容器中检查是否已存在注册的组件
 *    * lite(proxyBeanMethods = false)，容器中不在保存代理对象，不检查容器中的组件，每次都new对象
 *      应用场景：组件依赖
 */
@Import({User.class, DBHelper.class}) // @import给容器中自动创建组件,默认组件的名字是全类名

@Configuration // 告诉springboot这是一个配置类 等同于<bean>的配置文件
//@Configuration(proxyBeanMethods = true)

@ImportResource("classpath:bean.xml")

//@EnableConfigurationProperties(Jet.class)
// 1. 开启属性配置功能
// 2. 把Jet注册到容器中

public class Myconfig {

    /**
     * 外部无论对配置类中的这个组件的注册方法调用多少次，获取的都是同一个对象（单例）
     *
     */
    @Bean("Tom")
    public Pet mycat() {
        return new Pet("jerry");
    }

    /**
     * 给容器中添加组件
     * 方法名作为组件的id
     * 返回类型就是组件类型
     * 返回的对象就是组件在容器中的实例
     */
    @Bean
    /* ※注意这里是顺序加载的，由于myuser依赖于Tom，而此时还没有Tombean，myuser将不会生成 */
    @ConditionalOnBean(name = {"Tom"})
    public User myuser() {
        User user1 = new User("san", 5);
        user1.setPet(mycat());
        return user1;
    }

//    @Bean("jet")
//    public Jet getJet() {
//        return new Jet();
//    }

}
