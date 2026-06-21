public class shortestpath {

    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for(int i = 0; i< path.length(); i++) {
            char dir = path.charAt(i);
            // towards North
            if(dir == 'N') {
                y++;
            }
            // towards south
            else if(dir == 'S') {
                y--;
            }
            else if(dir == 'E') {
                x++;
            }
            else {
                x--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
    String path = "WNEENESENN";
    System.out.println(shortestPath(path));

    }
}
