package com.caigouzi.dfs;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/16 9:48
 */
public class Num733 {
    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0},
                {0, 0, 0}
        };
        Num733 num733 = new Num733();
        num733.floodFill(a, 0, 0, 2);
        for (int[] q : a
        ) {
            for (int b:
                 q) {
                System.out.print(b);

            }
            System.out.println();

        }
    }
    int original;
    int height;
    int width;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        original = image[sr][sc];
        height = image.length;
        width = image[0].length;

        dfs(image, sr, sc, newColor);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int newColor) {
        if (sr < 0 || sc < 0 || sr >= height || sc >= width || image[sr][sc] != original || image[sr][sc] == newColor) {
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, newColor);
        dfs(image, sr - 1, sc, newColor);
        dfs(image, sr, sc + 1, newColor);
        dfs(image, sr, sc - 1, newColor);

    }
}
