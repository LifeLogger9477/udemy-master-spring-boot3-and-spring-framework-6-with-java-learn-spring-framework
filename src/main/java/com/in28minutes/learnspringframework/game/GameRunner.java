package com.in28minutes.learnspringframework.game;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class GameRunner {

  MarioGame game;

  public GameRunner(MarioGame game) {

    this.game = game;
  }

  public void run() {

    System.out.println( "Running game: " + game );

    game.up();
    game.down();
    game.left();
    game.right();
  }
}
