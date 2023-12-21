package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

// record in JDK 16
// getter & setter 를 사용할 필요가 없다.
record Person(String name, int age) {
};

// address
record Address(String firstLine, String city) {

};

@Configuration
public class HelloWordConfiguration {

  @Bean
  public String name() {

    return "Ranga";
  }

  @Bean
  public int age() {

    return 15;
  }

  @Bean
  public Person person() {

    return new Person( "Ravi", 20 );
  }

  @Bean
  public Address address() {

    return new Address( "Baker Street", "London" );
  }
}
