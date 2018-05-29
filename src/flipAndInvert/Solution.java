package flipAndInvert;

import java.util.Stack;

public class Solution {
    private static final int[] invert = {1, 0};

    private int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < A[i].length; j++) {
                stack.push(A[i][j]);
            }
            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = invert[stack.pop()];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] B = s.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
        for (int[] row : B) {
            for (int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
