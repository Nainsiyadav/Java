public class shortest_path {
    // public static float getPath(String path){
    // int x = 0;
    // int y = 0;
    // for (int i = 0; i < path.length(); i++) {
    //     int direction = path.charAt(i);
    //     if(direction ==  'N'){
    //         y++;
    //     }else if(direction == 'S'){
    //         y--;
    //     }else if(direction == 'W'){
    //         x--;
    //     }else{
    //         x++;
    //     }
    // }
    // int x2 = x*x;
    // int y2 = y*y;
    // return (float)Math.sqrt(x2+y2);
    // }
    // public static void main(String[] args) {
    //     String path = "WNSENEEN";
    //     System.out.println(getPath(path));
    // }

    public static void main(String[] args) {
        String str = "Nainsi";
        
        for(int i=str.length();i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch+" ");
        }
    }
}
