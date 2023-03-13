/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author defok
 */
public class ectY {
    public static int ectY(int[][] d) {
        int[] sums = new int[d.length];
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                sums[i] += d[i][j];
                int max = sums[0];

                for (int k = 1; k < sums.length; k++) {
                    if (sums[k] > max) {
                        max = sums[k];
                        return j;
                    }
                }
            }
        }
        for (int i = 0; i < sums.length; i++) {
            for (int j = 0; j < sums.length; j++) {
                if (sums[i] == sums[j] && sums[i] != sums[j]) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
