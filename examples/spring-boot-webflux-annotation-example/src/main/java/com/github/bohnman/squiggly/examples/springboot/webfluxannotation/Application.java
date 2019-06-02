package com.github.bohnman.squiggly.examples.springboot.webfluxannotation;


import com.github.bohnman.squiggly.core.filter.SquigglyFilterCustomizer;
import com.github.bohnman.squiggly.core.filter.SquilggyFilterCustomizers;
import com.github.bohnman.squiggly.examples.springboot.webfluxannotation.web.ListResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public SquigglyFilterCustomizer squigglyFilterCustomizer() {
        return SquilggyFilterCustomizers.wrap(ListResponse.class, "items[", "]");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}