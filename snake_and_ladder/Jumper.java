import java.util.*;
public class Jumper {
    String name;
    Coordinates start;
    Coordinates end;
    Jumper(Coordinates start , Coordinates end){
        this.start = start;
        this.end = end;
        this.name = start.rn < end.rn ? "Snake" : "ladder";
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append("Start -> ").append(start.toString()).append(", End -> ").append(end.toString());
        return sb.toString();

    }
    
}
