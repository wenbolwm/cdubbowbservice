package com.ctrip.bbz.cdubbowbservice;

import org.springframework.boot.SpringApplication;

public class CdubbowbserviceApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        overrideArtemisUrl("10.2.35.218");
        SpringApplication.run(CdubbowbserviceInitializer.class, args);
    }

    private static void overrideArtemisUrl(String ip) {
        String url = String.format("http://%s:8080/artemis-service/", ip);
        System.setProperty("artemis.client.cdubbo.service.service.domain.url", url);
        System.setProperty("artemis.client.cdubbo.client.service.domain.url", url);
        System.setProperty("artemis.client.soa.service.service.domain.url", url);
        System.setProperty("artemis.client.soa.client.service.domain.url", url);
    }
}
