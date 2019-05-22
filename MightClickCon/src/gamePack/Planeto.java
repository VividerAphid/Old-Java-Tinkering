//Author: VividerAphid
package gamePack;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;

public class Planeto {
    int locX, locY;
    int radius;
    int owner;
    int idNum;
    int connections[];
    Color colour;
    boolean hasShield = false;
    public Planeto(int id, int rad){
        idNum = id;
        radius = rad;
    }
    public void loadUp(int own, Color col, int x, int y, int cons[]){
        owner = own;
        colour = col;
        locX = x;
        locY = y;
        connections = cons;
    } 
    public void drawPlaneto(Graphics g){
        g.setColor(colour);
        g.fillOval(locX,locY,radius,radius);
        //System.out.println("success?");
    }
    public void drawCons(Graphics gr){
        Graphics2D g = (Graphics2D) gr;
        for(int f = 0; f<connections.length;f++){
            if (GameScreen.gameMap[connections[f]].getOwner() == owner && owner != 0){
                g.setColor(colour);
            }
            else{
                g.setColor(Color.GRAY);     
            }
            g.setStroke(new BasicStroke(3));
            g.draw(new Line2D.Float(locX+radius/2,locY+radius/2,GameScreen.gameMap[connections[f]].getX()+radius/2,GameScreen.gameMap[connections[f]].getY()+radius/2));
        }
    }
    //Planeto setters
    public void setOwner(int own){
        owner = own;
    }
    public void setIDNum(int id){
        idNum = id;
    }
    public void setShield(boolean state){
        hasShield = state;
    }
    public void setColour(Color newCol){
        colour = newCol;
    }
    public void setRadius(int rad){
        radius = rad;
    }
    //Planeto getters
    public int getOwner(){
        return owner;
    }
    public int getIDNum(){
        return idNum;
    }
    public Color getColour(){
        return colour;
    }
    public boolean getShield(){
        return hasShield;
    }
    public int getRadius(){
        return radius;
    }
    public int[] getConnections(){
        return connections;
    }
    public int getX(){
        return locX;
    }
    public int getY(){
        return locY;
    }
}