package com.joshayoung.basicspringwebapp.domain.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test output");
    }
}
