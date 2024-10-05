package com.boyd.dotcom.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.boyd.dotcom")
public class AccountApplication {

  public static void main(String[] args) {
    SpringApplication.run(AccountApplication.class, args);
  }
}
