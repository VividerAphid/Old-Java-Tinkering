//Author: Vivi
import GameHandler.Game;

public class Launcher {
    public static void main(String[] args){
        System.out.println("Booting...");
        Game game = new Game("MysterySurvivalWorldGame", 1200,800);
        game.start();
        System.out.println("Complete.");
    }
}