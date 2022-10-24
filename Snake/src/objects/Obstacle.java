package objects;

import snakegame.SnakeGame;

public class Obstacle {
    SnakeGame main;
    public int oX, oY;

    public Obstacle(int sX, int sY){
        oX = sX;
        oY = sY;
    }
    public void setRandomPosition(){
        oX = (int) (Math.random() * main.w);
        oY = (int) (Math.random() * main.h);
    }
}
