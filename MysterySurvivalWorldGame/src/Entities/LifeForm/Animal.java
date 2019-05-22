//Author: Vivi
package Entities.LifeForm;

import java.awt.image.BufferedImage;
import GameHandler.Game;
import java.util.Random;

public class Animal extends LifeForm{
    private int xSpeed, ySpeed;
    public Animal(int hea, int x, int y, Game gm, BufferedImage im){
        super(im, hea, "Animal", x,y, gm);
        speed = 3;
    }
    @Override
    public void move(){
        Random rander = new Random();
        int temp = rander.nextInt(500);
        if (temp == 48){
            if (xSpeed != 0){
                xSpeed = 0;
            }
            else{
                temp = rander.nextInt(2);
                if(temp == 1){
                    xSpeed += 2;
                }
                else{
                    xSpeed -= 2;
                }
            }              
        }
        temp = rander.nextInt(50);
        if (temp == 48){
            if (ySpeed != 0){
                ySpeed = 0;
            }
            else{
                temp = rander.nextInt(2);
                if(temp == 1){
                    ySpeed += 2;
                }
                else{
                    ySpeed -= 2;
                }
            }              
        }
        xLoc += moveX;
        yLoc += moveY;
        if (xLoc > game.getWidth() + game.getWorld().getXWidth()){
            xLoc = -1 * (game.getWorld().getXWidth());
        }
        else if (xLoc < -1 * game.getWorld().getXWidth()){
            xLoc = game.getWidth() + game.getWorld().getXWidth() - 1;
        }
        if (yLoc > game.getHeight() + game.getWorld().getYWidth()){
            yLoc = -1 * (game.getWorld().getYWidth());
        }
        else if (yLoc < -1 *game.getWorld().getYWidth()){
            yLoc = game.getHeight() + game.getWorld().getYWidth() - 1;
        }
    }
    @Override
    public void getInput(){
        moveX = 0 + xSpeed;
        moveY = 0 + ySpeed;
        if(game.getKeyManager().up){
            moveY += speed;
        }
        if(game.getKeyManager().down){
            moveY -= speed;
        }
        if(game.getKeyManager().left){
            moveX += speed;
        }
        if(game.getKeyManager().right){
            moveX -= speed;
        }
    }
}