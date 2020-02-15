package com.ctrip.basebiz.cdubbowbservice.cdubbowbweb;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.ctrip.framework.cdubbo.spring.annotation.EnableCDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
@EnableCDubbo
public class CdubbowbWebApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        overrideArtemisUrl("10.2.35.218");
        SpringApplication.run(CdubbowbWebApplication.class, args);
    }

    private static void overrideArtemisUrl(String ip) {
        String url = String.format("http://%s:8080/artemis-service/", ip);
        System.setProperty("artemis.client.cdubbo.service.service.domain.url", url);
        System.setProperty("artemis.client.cdubbo.client.service.domain.url", url);
        System.setProperty("artemis.client.soa.service.service.domain.url", url);
        System.setProperty("artemis.client.soa.client.service.domain.url", url);
    }
}
