package com.kubeforce.scdftrigger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScdfTriggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScdfTriggerApplication.class, args);
    }
    @Bean
    public SenderFunction senderFunction(){return new SenderFunction();}
}
