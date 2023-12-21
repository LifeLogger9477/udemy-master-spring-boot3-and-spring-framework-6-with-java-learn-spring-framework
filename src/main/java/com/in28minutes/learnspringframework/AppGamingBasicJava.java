package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class AppGamingBasicJava {

  public static void main(String[] args) {
 
    // 1: Object Creation
    //var game = new MarioGame();
    //var game = new SuperContraGame();
    var game = new PacmanGame();

    // 2: Object Creation + Wiring of Dependencies
    // Game is dependency of GameRunner
    var gameRunner = new GameRunner( game );

    gameRunner.run();
  }
}
