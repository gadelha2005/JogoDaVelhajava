package app;

import entities.Game;
import entities.Player;

public class Application {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 'X');
        Player player2 = new Player("Player2", 'O');
        Game game = new Game(player1, player2);
        game.start();
        
    }
}
