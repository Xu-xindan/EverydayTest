/*
*青蛙落入了迷宫,希望用自己仅剩的体力P跳出 假设这是一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,
* 1代表小青蛙可以达到的位置。青蛙初始在(0,0),迷宫的出口在(0,m-1)(保证这两个位置都是1,保证一定有起点到终点可达的路径),
* 青蛙在迷宫中水平移动一个单位需要消耗1点体力值,向上爬一个单位需要消耗3个单位的体力值,向下移动不消耗体力
* 当青蛙的体力值等于0的时候还没有到达出口,青蛙将无法逃离 需要你计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。
* */
import java.util.Scanner;
public class swog {
    static String path = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int power = in.nextInt();
            //二维数组表示迷宫
            int[][] maze = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++)
                    maze[i][j] = in.nextInt();
            }
            boolean[][] visited = new boolean[n][m];
            if(n <= 0) {
                System.out.println("Can not escape!");
            }else {
                System.out.println(findPath( maze, 0, 0, "", visited, power));
            }
        }
    }

    public static String  findPath( int[][] maze, int nowx, int nowy, String res, boolean[][] visited, int power){
        int n=maze.length;
        int m=maze[0].length;
        if(nowx == 0 && nowy == m - 1 && maze[0][m - 1] == 1){
            if(power >= 0)
                path = res + "[0," + (m - 1) + "]";
            else
                path = "Can not escape!";
            return path;
        }
        if(nowx < n && nowy < m && nowx >= 0 && nowy >= 0 && maze[nowx][nowy] == 1 && !visited[nowx][nowy]){
            visited[nowx][nowy] = true;
            res += "[" + nowx + "," + nowy + "],";
            // 水平向右
            findPath( maze, nowx, nowy + 1, res, visited, power - 1);
            // 向下 向下走时从第0行变成第一行 nowx+1
            findPath( maze, nowx + 1, nowy, res, visited, power);
            // 水平向左
            findPath( maze, nowx, nowy - 1, res, visited, power - 1);
            // 向上
            findPath( maze, nowx - 1, nowy, res, visited, power - 3);
        }
        return path;
    }
}

