package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

@Configuration
public class HelloWordConfiguration {

  @Bean
  public String name() {

    return "Ranga";
  }
}
