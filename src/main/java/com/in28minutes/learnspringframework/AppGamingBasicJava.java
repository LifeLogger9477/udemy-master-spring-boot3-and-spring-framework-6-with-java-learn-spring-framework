package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class AppGamingBasicJava {

  public static void main(String[] args) {

    var marioGame = new MarioGame();
    var gameRunner = new GameRunner( marioGame );
    gameRunner.run();
  }
}
