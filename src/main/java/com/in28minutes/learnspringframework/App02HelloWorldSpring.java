package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class App02HelloWorldSpring {

  public static void main(String[] args) {

    // 1: Launch a Spring Context
    var context =
        new AnnotationConfigApplicationContext( HelloWordConfiguration.class );

    // 2: Configure the things that we want Spring to manage
    // HelloWorldConfiguration - @Configuration
    // name - @Beam

    // 3: Retrieving Beans managed by Spring
    System.out.println( context.getBean( "name" ) );
  }
}
