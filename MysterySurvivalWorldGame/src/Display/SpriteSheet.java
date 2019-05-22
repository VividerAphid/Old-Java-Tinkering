//Author: Vivi
package Display;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private BufferedImage shet;
    public SpriteSheet(BufferedImage sht){
        shet = sht;
    }
    public BufferedImage crop(int x, int y, int wid, int hei){
        return shet.getSubimage(x,y,wid,hei);
    }
}