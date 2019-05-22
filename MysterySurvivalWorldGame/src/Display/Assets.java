//Author: Vivi
package Display;

import java.awt.image.BufferedImage;

public class Assets {
    private static int wid = 100, hei = 100;
    public static BufferedImage dogge, bussh, berrGras, ston, tre, triLegg, duckette, theSpike, marriagePlant, arfSeel, bebeh, rablit;
    
    public static void init(){
        SpriteSheet shet = new SpriteSheet(ImageLoader.loadImage("/images/mobs/charShet.png"));
        dogge = shet.crop(0, 0, wid, hei);
        bussh = shet.crop(wid, 0, wid, hei);
        ston = shet.crop(wid*2, 0, wid, hei);
        tre = shet.crop(wid*3, 0, wid*2, hei*2);
        triLegg = shet.crop(0, hei, wid, hei);
        duckette = shet.crop(wid, hei, wid, hei);
        theSpike = shet.crop(wid*2, hei, wid, hei);
        berrGras = shet.crop(0, hei*2, wid, hei);
        arfSeel = shet.crop(wid, hei*3, wid, hei);
        bebeh = shet.crop(wid, hei*2, wid, hei);
        rablit = shet.crop(wid*2, hei*2, wid, hei);
        marriagePlant = shet.crop(0, hei*3, wid, hei);
        System.out.println("Finished loading assets.");
    }
}
