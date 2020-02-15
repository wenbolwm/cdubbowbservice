package com.ctrip.basebiz.cdubbowbservice.cdubbowbweb;

import org.springframework.boot.SpringApplication;

import java.awt.*;
import java.net.URI;

/**
 * @author hy_gu on 2018/3/9
 **/
public class CDubboSOASpringBootClient {

  public static void main(String[] args) throws Exception {
    System.setProperty("java.awt.headless", "false");
    overrideArtemisUrl("10.2.35.218");
    //SpringApplication.run(WebInitializer.class);
    Desktop.getDesktop().browse(new URI("http://localhost:8090/"));
  }

  private static void overrideArtemisUrl(String ip) {
    String url = String.format("http://%s:8080/artemis-service/", ip);
    System.setProperty("artemis.client.cdubbo.service.service.domain.url", url);
    System.setProperty("artemis.client.cdubbo.client.service.domain.url", url);
    System.setProperty("artemis.client.soa.service.service.domain.url", url);
    System.setProperty("artemis.client.soa.client.service.domain.url", url);
  }
}
