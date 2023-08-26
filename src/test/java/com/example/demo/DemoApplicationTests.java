package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class DemoApplicationTests {

    ApplicationModules modules = ApplicationModules.of(DemoApplication.class);

    @Test
    void verify() {
        modules.verify();
    }
}
