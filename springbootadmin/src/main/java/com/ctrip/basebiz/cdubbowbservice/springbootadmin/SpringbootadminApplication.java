package com.ctrip.basebiz.cdubbowbservice.springbootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringbootadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootadminApplication.class, args);
    }
}
