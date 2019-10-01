package ru.vlad.evrica.jettyinfoserver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc
@ComponentScan("ru.vlad.evrica.jettyinfoserver.controller")
@Import(AppConfig.class)
public class DispatcherServletConfig extends WebMvcConfigurationSupport {

}
