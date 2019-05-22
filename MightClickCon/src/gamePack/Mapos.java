//Author: VividerAphid
package gamePack;
import java.awt.Color;
public class Mapos {
    int shiftX = 10;
    int shiftY = 33;
    int boners[][];
    
    public Planeto[] testMap(int rad, double scale){
        //System.out.println("Entered!");
        Planeto map[] = new Planeto[12];
        for (int q = 0; q < map.length; q++){
            //System.out.println("q: " + q);
            map[q] = new Planeto(q,(int)(rad*scale));
        }
        map[0].loadUp(1,Color.RED,100,100, new int[]{3,8,11}); 
        map[1].loadUp(0, Color.WHITE, 100, 400, new int[]{6, 9, 11});
        map[2].loadUp(0, Color.WHITE, 400, 100, new int[]{5, 8, 10});
        map[3].loadUp(0, Color.WHITE, 200, 200, new int[]{0, 5, 6, 8, 11});
        map[4].loadUp(0, Color.WHITE, 300, 300, new int[]{5, 6, 7, 9, 10});
        map[5].loadUp(0, Color.WHITE, 300, 200, new int[]{2, 3, 4, 8, 10});
        map[6].loadUp(0, Color.WHITE, 200, 300, new int[]{1, 3, 4, 9, 11});
        map[7].loadUp(0, Color.WHITE, 400, 400, new int[]{4, 9, 10});
        map[8].loadUp(0, Color.WHITE, 250, 100, new int[]{0, 2, 3, 5});
        map[9].loadUp(0, Color.WHITE, 250, 400, new int[]{1, 4, 6, 7});
        map[10].loadUp(0, Color.WHITE, 400, 250, new int[]{2, 4, 5, 7});
        map[11].loadUp(0, Color.WHITE, 100, 250, new int[]{0, 1, 3, 6});
        
        //System.out.println("Finished! Returning map now...");
        return map;
    }
    public Planeto[] spiralGal(int rad, double scale){
        Planeto map[] = new Planeto[82];
        for (int q = 0; q < map.length; q++){
            map[q] = new Planeto(q,(int)(rad*scale));
        }
        map[0].loadUp(0, Color.WHITE, 140+shiftX, 45+shiftY, new int[]{2, 10});
        map[1].loadUp(0, Color.WHITE, 705+shiftX, 5+shiftY, new int[]{6, 7, 8});
        map[2].loadUp(0, Color.WHITE, 55+shiftX, 65+shiftY, new int[]{0, 9, 10});
        map[3].loadUp(0, Color.WHITE, 345+shiftX, 60+shiftY, new int[]{4, 11});
        map[4].loadUp(0, Color.WHITE, 445+shiftX, 60+shiftY, new int[]{3, 5, 12, 13});
        map[5].loadUp(0, Color.WHITE, 530+shiftX, 40+shiftY, new int[]{4, 6, 14});
        map[6].loadUp(0, Color.WHITE, 620+shiftX, 25+shiftY, new int[]{1, 5, 7, 14});
        map[7].loadUp(0, Color.WHITE, 695+shiftX, 45+shiftY, new int[]{1, 6, 8, 15, 16});
        map[8].loadUp(0, Color.WHITE, 765+shiftX, 40+shiftY, new int[]{1, 7, 16});
        map[9].loadUp(0, Color.WHITE, 5+shiftX, 110+shiftY, new int[]{2, 17, 22});
        map[10].loadUp(0, Color.WHITE, 130+shiftX, 100+shiftY, new int[]{0, 2, 17, 23});
        map[11].loadUp(0, Color.WHITE, 305+shiftX, 105+shiftY, new int[]{3, 18});
        map[12].loadUp(0, Color.WHITE, 405+shiftX, 115+shiftY, new int[]{4, 19, 24});
        map[13].loadUp(0, Color.WHITE, 510+shiftX, 105+shiftY, new int[]{4, 14, 19, 20});
        map[14].loadUp(0, Color.WHITE, 580+shiftX, 90+shiftY, new int[]{5, 6, 13, 15, 20});
        map[15].loadUp(0, Color.WHITE, 655+shiftX, 95+shiftY, new int[]{7, 14, 16, 21});
        map[16].loadUp(0, Color.WHITE, 740+shiftX, 105+shiftY, new int[]{7, 8, 15});
        map[17].loadUp(0, Color.WHITE, 80+shiftX, 135+shiftY, new int[]{9, 10, 22, 23});
        map[18].loadUp(0, Color.WHITE, 240+shiftX, 135+shiftY, new int[]{11, 28});
        map[19].loadUp(0, Color.WHITE, 460+shiftX, 140+shiftY, new int[]{12, 13, 20, 24, 25});
        map[20].loadUp(0, Color.WHITE, 535+shiftX, 145+shiftY, new int[]{13, 14, 19, 21, 25});
        map[21].loadUp(0, Color.WHITE, 595+shiftX, 150+shiftY, new int[]{15, 20, 26});
        map[22].loadUp(0, Color.WHITE, 30+shiftX, 185+shiftY, new int[]{9, 17, 23, 27});
        map[23].loadUp(0, Color.WHITE, 135+shiftX, 165+shiftY, new int[]{10, 17, 22, 27, 28, 33});
        map[24].loadUp(0, Color.WHITE, 410+shiftX, 170+shiftY, new int[]{12, 19, 25, 29, 30, 31});
        map[25].loadUp(0, Color.WHITE, 490+shiftX, 190+shiftY, new int[]{19, 20, 24, 31});
        map[26].loadUp(0, Color.WHITE, 685+shiftX, 195+shiftY, new int[]{21, 32, 39});
        map[27].loadUp(0, Color.WHITE, 75+shiftX, 230+shiftY, new int[]{22, 23, 33, 40});
        map[28].loadUp(0, Color.WHITE, 195+shiftX, 200+shiftY, new int[]{18, 23, 29, 33, 34});
        map[29].loadUp(0, Color.WHITE, 290+shiftX, 220+shiftY, new int[]{24, 28, 30, 34, 35, 36});
        map[30].loadUp(0, Color.WHITE, 375+shiftX, 230+shiftY, new int[]{24, 29, 31, 36, 37});
        map[31].loadUp(0, Color.WHITE, 465+shiftX, 230+shiftY, new int[]{24, 25, 30, 37, 38, 45});
        map[32].loadUp(0, Color.WHITE, 630+shiftX, 235+shiftY, new int[]{26, 39});
        map[33].loadUp(0, Color.WHITE, 140+shiftX, 235+shiftY, new int[]{23, 27, 28, 34, 40, 41});
        map[34].loadUp(0, Color.WHITE, 190+shiftX, 260+shiftY, new int[]{28, 29, 33, 35, 41, 42});
        map[35].loadUp(0, Color.WHITE, 265+shiftX, 280+shiftY, new int[]{29, 34, 36, 42, 43});
        map[36].loadUp(0, Color.WHITE, 325+shiftX, 275+shiftY, new int[]{29, 30, 35, 37, 43, 44});
        map[37].loadUp(0, Color.WHITE, 425+shiftX, 275+shiftY, new int[]{30, 31, 36, 44, 45, 50});
        map[38].loadUp(0, Color.WHITE, 550+shiftX, 270+shiftY, new int[]{31, 45, 46, 51});
        map[39].loadUp(0, Color.WHITE, 715+shiftX, 275+shiftY, new int[]{26, 32, 53});
        map[40].loadUp(0, Color.WHITE, 85+shiftX, 300+shiftY, new int[]{27, 33, 41});
        map[41].loadUp(0, Color.WHITE, 160+shiftX, 315+shiftY, new int[]{33, 34, 40, 42, 47});
        map[42].loadUp(0, Color.WHITE, 220+shiftX, 335+shiftY, new int[]{34, 35, 41, 43, 48});
        map[43].loadUp(0, Color.WHITE, 310+shiftX, 325+shiftY, new int[]{35, 36, 42, 44, 48, 49});
        map[44].loadUp(0, Color.WHITE, 375+shiftX, 310+shiftY, new int[]{36, 37, 43, 49, 50});
        map[45].loadUp(0, Color.WHITE, 490+shiftX, 305+shiftY, new int[]{31, 37, 38, 50, 51, 57});
        map[46].loadUp(0, Color.WHITE, 625+shiftX, 295+shiftY, new int[]{38, 51, 52, 53});
        map[47].loadUp(0, Color.WHITE, 160+shiftX, 385+shiftY, new int[]{41, 54});
        map[48].loadUp(0, Color.WHITE, 280+shiftX, 395+shiftY, new int[]{42, 43, 49, 55});
        map[49].loadUp(0, Color.WHITE, 355+shiftX, 375+shiftY, new int[]{43, 44, 48, 50, 55, 56, 62});
        map[50].loadUp(0, Color.WHITE, 425+shiftX, 340+shiftY, new int[]{37, 44, 45, 49, 56});
        map[51].loadUp(0, Color.WHITE, 565+shiftX, 330+shiftY, new int[]{38, 45, 46, 52, 57});
        map[52].loadUp(0, Color.WHITE, 630+shiftX, 350+shiftY, new int[]{46, 51, 58, 59});
        map[53].loadUp(0, Color.WHITE, 705+shiftX, 335+shiftY, new int[]{39, 46, 59, 60});
        map[54].loadUp(0, Color.WHITE, 165+shiftX, 440+shiftY, new int[]{47, 61});
        map[55].loadUp(0, Color.WHITE, 310+shiftX, 445+shiftY, new int[]{48, 49, 62, 68});
        map[56].loadUp(0, Color.WHITE, 440+shiftX, 400+shiftY, new int[]{49, 50, 57, 62, 63});
        map[57].loadUp(0, Color.WHITE, 550+shiftX, 375+shiftY, new int[]{45, 51, 56, 58});
        map[58].loadUp(0, Color.WHITE, 610+shiftX, 410+shiftY, new int[]{52, 57, 59, 64, 65, 66});
        map[59].loadUp(0, Color.WHITE, 690+shiftX, 395+shiftY, new int[]{52, 53, 58, 60, 66});
        map[60].loadUp(0, Color.WHITE, 770+shiftX, 420+shiftY, new int[]{53, 59, 67});
        map[61].loadUp(0, Color.WHITE, 235+shiftX, 475+shiftY, new int[]{54, 68});
        map[62].loadUp(0, Color.WHITE, 375+shiftX, 460+shiftY, new int[]{49, 55, 56, 63, 68, 69});
        map[63].loadUp(0, Color.WHITE, 455+shiftX, 465+shiftY, new int[]{56, 62, 69});
        map[64].loadUp(0, Color.WHITE, 565+shiftX, 470+shiftY, new int[]{58, 70});
        map[65].loadUp(0, Color.WHITE, 640+shiftX, 485+shiftY, new int[]{58, 66, 71});
        map[66].loadUp(0, Color.WHITE, 710+shiftX, 455+shiftY, new int[]{58, 59, 65, 67, 71});
        map[67].loadUp(0, Color.WHITE, 775+shiftX, 480+shiftY, new int[]{60, 66, 71, 72});
        map[68].loadUp(0, Color.WHITE, 310+shiftX, 500+shiftY, new int[]{55, 61, 62, 69, 75, 76});
        map[69].loadUp(0, Color.WHITE, 410+shiftX, 515+shiftY, new int[]{62, 63, 68, 70, 76, 77});
        map[70].loadUp(0, Color.WHITE, 490+shiftX, 520+shiftY, new int[]{64, 69});
        map[71].loadUp(0, Color.WHITE, 705+shiftX, 530+shiftY, new int[]{65, 66, 67, 72});
        map[72].loadUp(0, Color.WHITE, 765+shiftX, 545+shiftY, new int[]{67, 71});
        map[73].loadUp(0, Color.WHITE, 80+shiftX, 565+shiftY, new int[]{74, 78});
        map[74].loadUp(0, Color.WHITE, 165+shiftX, 550+shiftY, new int[]{73, 75, 78});
        map[75].loadUp(0, Color.WHITE, 240+shiftX, 565+shiftY, new int[]{68, 74, 76, 78, 79});
        map[76].loadUp(0, Color.WHITE, 340+shiftX, 560+shiftY, new int[]{68, 69, 75, 79, 80});
        map[77].loadUp(0, Color.WHITE, 435+shiftX, 570+shiftY, new int[]{69, 80});
        map[78].loadUp(0, Color.WHITE, 165+shiftX, 600+shiftY, new int[]{73, 74, 75, 81});
        map[79].loadUp(0, Color.WHITE, 300+shiftX, 620+shiftY, new int[]{75, 76, 80});
        map[80].loadUp(0, Color.WHITE, 390+shiftX, 620+shiftY, new int[]{76, 77, 79});
        map[81].loadUp(0, Color.WHITE, 230+shiftX, 655+shiftY, new int[]{78, 79});

        map[0].setOwner(1);
        map[0].setColour(Color.RED);
        map[72].setOwner(2);
        map[72].setColour(Color.BLUE);
        map[8].setOwner(3);
        map[8].setColour(Color.GREEN);
        map[73].setOwner(4);
        map[73].setColour(Color.YELLOW);
        return map;
    }
}