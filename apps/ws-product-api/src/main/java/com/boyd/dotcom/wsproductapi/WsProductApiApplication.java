package com.boyd.dotcom.wsproductapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.boyd.dotcom")
public class WsProductApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(WsProductApiApplication.class, args);
  }
}
