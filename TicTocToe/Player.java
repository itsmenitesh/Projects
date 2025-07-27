package TicTocToe;
import java.util.*;
public class Player {
    String name;
    char symbol;
    static int symbolCount=0;
    Player(String name){
        this.name =name;
        this.symbol = symbolCount==0 ? 'X' :'O';
        symbolCount++;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name : ").append(this.name).append("symbol : ").append(this.symbol).append("\n");
        return sb.toString();
    }
}
