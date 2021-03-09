/*
* 房子地上铺了红色、黑色两种颜色的正方形瓷砖。你站在其中一块黑色的瓷砖上，
* 只能向相邻的（上下左右四个方向）黑色瓷砖移动。请写一个程序，计算你总共能够到达多少块黑色的瓷砖。
*广度优先遍历bfs
* */

import java.util.*;
public class redAndBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            //换行 必须要有不然还在第一行
            sc.nextLine();
            //二维数组保存
            Character[][] map = new Character[m][n];
            //开始节点表示当前站的位置
            Node start = null;
            for (int i = 0; i < m; i ++ ) {
                String s = sc.nextLine();
                for (int j = 0; j < n; j ++ ) {
                    map[i][j] = s.charAt(j);
                    //找到字符‘@’ 用start表示
                    if(s.charAt(j) == '@') start = new Node(i, j);
                }
            }
            //方向数组 表示往上下左右移动一位需要增加的坐标量
            int[][] direction = {{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}};
            bfs(map, direction, start);
        }
    }
    //广度优先遍历
    public static void bfs(Character[][] map, int[][] direction, Node start) {
        //定义Node队列 把可走到的结点放进去
        Queue<Node> queue = new LinkedList<Node>();
        //可以走到的二维数组
        boolean[][] visited = new boolean[map.length][map[0].length];
        queue.add(start);
        //当前瓷砖为true
        visited[start.x][start.y] = true;
        int count = 1;
        while ( ! queue.isEmpty()) {
            //取出队列第一个元素
            Node cur = queue.poll();
            //遍历它上下左右的元素
            for (int i = 0; i < 4; i ++ ) {
                Node next = new Node(cur.x + direction[i][0], cur.y + direction[i][1]);
                //若该元素x,y都在数组内并且不是'#'也不在visited数组里就新增
                if(next.x >= 0 && next.x < map.length && next.y >= 0 && next.y < map[0].length
                        && map[next.x][next.y] != '#' && ! visited[next.x][next.y]) {
                    count ++ ;
                    queue.add(next);
                    visited[next.x][next.y] = true;
                }
            }
        }
        System.out.println(count);
    }
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
