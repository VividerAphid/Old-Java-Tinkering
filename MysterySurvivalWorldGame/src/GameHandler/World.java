//Author: Vivi
package GameHandler;

import Entities.*;
import Entities.LifeForm.*;
import java.awt.Graphics;
import Display.Assets;
import java.awt.image.BufferedImage;
import java.util.Random;

public class World {
    private Entity entList[] = new Entity[32];
    private int xWidth = 500, yWidth = 500;
    private Game gam;
    
    
    public void initWorld(Game gm){
        gam = gm;
        entList[0] = new Player(50,550,350, gm);
        loadAnimules();
        loadPlanten();
    }
    private void loadAnimules(){
        BufferedImage[] spirt = {Assets.arfSeel, Assets.triLegg, Assets.bebeh, Assets.theSpike, Assets.dogge, Assets.rablit};
        for(int r = 1; r < 10; r++){
            Random rand = new Random();
            int x, y;
            x = rand.nextInt((gam.getWidth()+ xWidth * 2) - xWidth);
            y = rand.nextInt((gam.getHeight()+ yWidth * 2) - yWidth);
            entList[r] = new Animal(50, x, y, gam, spirt[rand.nextInt(spirt.length)]);
        }
    }
    private void loadPlanten(){
        BufferedImage[] spirt = {Assets.berrGras, Assets.bussh, Assets.marriagePlant, Assets.tre};
        for(int r = 10; r < 32; r++){
            Random rand = new Random();
            int x, y;
            x = rand.nextInt((gam.getWidth()+ xWidth * 2) - xWidth);
            y = rand.nextInt((gam.getHeight()+ yWidth * 2) - yWidth);
            entList[r] = new Plant(50, x, y, gam, spirt[rand.nextInt(spirt.length)]);
        }
    }
    public void tick(){
        for(int i = 0; i < 32; ++i){
            entList[i].tick();
        }
    }
    public void render(Graphics g){
        for(int i = 0; i < 32; ++i){
            entList[i].render(g);
        }
    }
    public int getXWidth(){
        return xWidth;
    }
    public int getYWidth(){
        return yWidth;
    }
    
}