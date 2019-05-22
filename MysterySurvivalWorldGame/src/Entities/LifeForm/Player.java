//Author: Vivi
package Entities.LifeForm;

import Display.Assets;
import GameHandler.Game;

public class Player extends LifeForm{
    public Player(int hea, int x, int y, Game gm){
        super(Assets.duckette, hea, "Player", x,y, gm);
    }
}