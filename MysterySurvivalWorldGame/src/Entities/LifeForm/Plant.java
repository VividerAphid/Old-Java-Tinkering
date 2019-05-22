//Author: Vivi
package Entities.LifeForm;

import GameHandler.Game;
import java.awt.image.BufferedImage;

public class Plant extends LifeForm{
    public Plant(int hea, int x, int y, Game gm, BufferedImage im){
        super(im, hea, "Plant", x,y,gm);
        speed = 3;
    }
}