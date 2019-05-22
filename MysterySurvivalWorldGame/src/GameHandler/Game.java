//Author: Vivi
package GameHandler;

import Display.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game implements Runnable{
    private Display display;
    private KeyManager keymanager;
    private boolean isRunning = false;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private String title;
    private int width, height;
    private Thread thread;
    
    private World world;
    
    public Game(String tit, int wid, int hei){
        width = wid;
        height = hei;
        title = tit;
        keymanager = new KeyManager();
        world = new World();
    }
    private void init(){
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keymanager);
        Assets.init();
        world.initWorld(this);
    }
    private void gameTick(){
        keymanager.tick();
        world.tick();
    }
    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null){
            display.getCanvas().createBufferStrategy(3);
            System.out.println("Added buffer strat");
            return;
        }
        g = bs.getDrawGraphics();
        g.clearRect(0,0,width,height);
        g.fillRect(0,0,width,height);
        
        world.render(g);
        
        bs.show();
        g.dispose();
    }
    @Override
    public void run(){
        init();
        int fps = 60;
        double timePerTick = 1000000000/fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;
        while(isRunning){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;
            
            if(delta >= 1){
                gameTick();
                render();
                delta -= 1;
                ticks += 1;
            }
            if (timer >= 1000000000){
                //System.out.println("Ticks and frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
    }    
    public KeyManager getKeyManager(){
        return keymanager;
    }
    public synchronized void start(){
        if (isRunning){
            return;
        }
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }   
    public synchronized void stop(){
        if (!isRunning){
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public World getWorld(){
       return world;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}