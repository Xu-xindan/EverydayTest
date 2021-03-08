import java.util.*;

public class swog {
    static boolean flag = false;
    static int n, m, p;
    static String path = "";
    static int maxRemain;
    static int[][] map;
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            p = sc.nextInt();
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            search(0, 0, p);
            if(flag == true) {
                System.out.println(path);
            } else {
                System.out.println("Can not escape!");
            }
        }
    }

    private static void search(int i, int j, int energy) {
        if (i < 0 || i >= n || j < 0 || j >= m || energy < 0 || map[i][j] != 1) {
            return;
        } else {
            map[i][j] = 2;
            list.add("[" + i + "," + j + "]");
            if (i == 0 && j == m - 1) {
                if (energy >= maxRemain) {
                    maxRemain = energy;
                    updatePath();
                }
                map[i][j] = 1;
                list.removeLast();
                flag = true;
                return;
            }
        }
        search(i - 1, j, energy - 3);
        search(i + 1, j, energy);
        search(i, j - 1, energy - 1);
        search(i, j + 1, energy - 1);
        map[i][j] = 1;
        list.removeLast();
    }

    private static void updatePath() {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str + ",");
        }
        path = sb.deleteCharAt(sb.length() - 1).toString();
    }
}
