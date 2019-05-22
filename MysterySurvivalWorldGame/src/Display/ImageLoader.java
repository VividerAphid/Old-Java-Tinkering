//Author: Vivi
package Display;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    public static BufferedImage loadImage(String path){
        try {
            System.out.println("Image load succeeded.");
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException ex) {
            System.out.println("Image load failed.");
            ex.printStackTrace();
            System.exit(1);
        }
        return new BufferedImage(0,0,0);
    }
}