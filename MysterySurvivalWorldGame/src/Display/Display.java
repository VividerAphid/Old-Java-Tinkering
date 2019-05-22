//Author: Vivi
package Display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {
    private JFrame frame;
    private Canvas canvas;
    private int width, height;
    private String title;
    
    public Display(String tit, int wid, int hei){
        title = tit;
        width = wid;
        height = hei;
        createDisplay();
    }
    
    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false);
        
        frame.add(canvas);
        frame.pack();
                
    }
    public Canvas getCanvas(){
        return canvas;
    }
    public JFrame getFrame(){
        return frame;
    }
}