package flipAndInvert;

public class Solution {
    private static final int[] invert = {1, 0};

    private int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = A[i].length-1; j >= 0; j--) {
                B[i][A[i].length-1-j] = invert[A[i][j]];
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
