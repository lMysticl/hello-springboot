package com.hellokoding.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Pavel Putrenkov
 */
@Configuration
@ComponentScan
@EnableWebMvc
public class SpringServletConfig {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setSuffix(".jsp");
        return vr;
    }
}
