package by.itclass.configs;

import by.itclass.model.entities.Address;
import by.itclass.model.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("by.itclass")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        var viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public Configuration configuration() {
        var conf = new Configuration();
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Address.class);
        return conf;
    }

    @Bean
    public SessionFactory factory(Configuration configuration) {
        return configuration.buildSessionFactory();
    }
}
