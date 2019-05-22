//Author: Vivi
package Entities.Items;

import Entities.Entity;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Item extends Entity{
    protected BufferedImage img;
    @Override
    public void tick() {
    }
    @Override
    public void render(Graphics g) {
        g.drawImage(img, xLoc, yLoc, null);
    }
}