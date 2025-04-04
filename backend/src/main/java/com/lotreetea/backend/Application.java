package com.lotreetea.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

// @SpringBootApplication
// public class Application {

// 	public static void main(String[] args) {
// 		SpringApplication.run(Application.class, args);
// 	}

// }

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port == null) {
            port = "8080"; // fallback for local dev
        }

        SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", port));
        app.run(args);
    }
}
