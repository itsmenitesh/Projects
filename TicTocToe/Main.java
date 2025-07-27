package TicTocToe;
import java.util.*;
public class Main {
    public static void main(String []args){
        Player p1 = new Player("Nitesh");
        System.out.println(p1);
        Player p2 = new Player("Debanjana");
        System.out.println(p2);
        Board board = new Board(3);
        Game game = new Game(board, new Player[]{p1 , p2});//for two player game
        // Game game = new OnePlayerGame(board, new Player[]{p1, p2}); for onr plyer game//
        game.play();
    }    
}
