//Author: Vivi
package Entities.LifeForm;

import Entities.Entity;
import GameHandler.Game;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class LifeForm extends Entity{
    protected BufferedImage img;
    protected int health;
    protected int moveX = 0, moveY = 0;
    protected int speed = 0;
    protected int hostility;
    protected Game game;
    
    public LifeForm(BufferedImage in, int hea, String nam, int x, int y, Game gm){
        img = in;
        health = hea;
        name = nam;
        xLoc = x;
        yLoc = y;
        game = gm;
    }
    public void move(){
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
    public void getInput(){
        moveX = 0;
        moveY = 0;
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
    @Override
    public void tick(){
        getInput();
        move();
    }
    @Override
    public void render(Graphics g){
        g.drawImage(img, xLoc, yLoc, null);
        //System.out.println(name + " rendered.");
    }    
    public int getHealth(){
        return health;
    }
    public int getHostility(){
        return hostility;
    }
    public void setHealth(int hea){
        health = hea;
    }
    public void setHostility(int amt){
        hostility = amt;
    }
}