//Author: VividerAphid
package gamePack;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

public class GameScreen extends JFrame implements MouseListener{
    static Planeto gameMap[];
    Mapos mapHandler = new Mapos();
    
    public int playerCount = 4;
    public int turnOwner = 1;
    public Color playerColours[] = {Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW};
    
    public GameScreen(){
        addMouseListener(this);
        System.out.println("Initialised!");
        setBackground(Color.BLACK);
        gameMap = mapHandler.spiralGal(30, 1);
    }
    public void initWind(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1250, 750);
        setLocation(0,0);
        setTitle("ClickCon!");
        setVisible(true);
        setBackground(Color.BLACK);
        System.out.println("Set Up!");
    }
    public void checkHit(Planeto targ, int x, int y){
        if(x > targ.getX() && x < targ.getX()+targ.getRadius()){
            if(y > targ.getY() && y < targ.getY()+targ.getRadius()){
                //System.out.println("HIT THE BATTLESHIP");
                //System.out.println("Planeto: " + targ.getIDNum());
                if(checkConnected(targ)){
                targ.setOwner(turnOwner);
                targ.setColour(playerColours[turnOwner-1]);
                changePlayer();
                }
            }   
        }
    }
    public boolean checkConnected(Planeto targ){
        int tempCons[] = targ.getConnections();
        for(int c = 0; c<tempCons.length;c++){
            if (gameMap[tempCons[c]].getOwner() == turnOwner && targ.getOwner() != turnOwner){
                return true;
            }
        }
        return false;
    }
    public void changePlayer(){
        if (turnOwner < playerCount){
            turnOwner += 1;
        }
        else{
            turnOwner = 1;
        }
    }
    
    
    @Override
    public void paint(Graphics g){
        //setBackground(Color.BLACK);
        g.setColor(playerColours[turnOwner-1]);
        g.fillOval(1000,375,50,50);
        for(int v = 0; v < gameMap.length;v++){
            gameMap[v].drawCons(g);
        }
        for(int v = 0; v < gameMap.length;v++){
            //System.out.println("Drawing planeto " + v + "!");
            gameMap[v].drawPlaneto(g);
            //System.out.println("Colour is: " + gameMap[v].getColour());
        }
        System.out.println("Paint!");
    }
    //MouseListener events
    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
       repaint();
       //PointerInfo clickInfo = MouseInfo.getPointerInfo();
       int clickX = e.getX();
       int clickY = e.getY();
       System.out.println("Location is: " + clickX + "," + clickY);
       for(int g = 0;g<gameMap.length;g++){
           checkHit(gameMap[g],clickX,clickY);
       }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       
    }
}