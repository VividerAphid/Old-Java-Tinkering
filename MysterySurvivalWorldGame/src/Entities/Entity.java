//Author: Vivi
package Entities;

import java.awt.Graphics;

public abstract class Entity {
    protected int xLoc, yLoc;
    protected String name;
    
    public int getXLoc(){
        return xLoc;
    }
    public int getYLoc(){
        return yLoc;
    }
    public String getName(){
        return name;
    }
    public void setXLoc(int x){
        xLoc = x;
    }
    public void setYLoc(int y){
        yLoc = y;
    }
    public void setName(String nam){
        name = nam;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
}