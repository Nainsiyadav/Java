public class interfaces {

    public static void main(String[] args) {
       Queen q = new Queen();
       q.move(); 
    }
}

interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer {
    public void move() {
        System.out.println("left,right,up,doun,diagonal");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("left ,right,up,down,diagonal");
    }
}
class rook implements ChessPlayer{
    public void move(){
        System.out.println("left,right,up,down");
    }
}
