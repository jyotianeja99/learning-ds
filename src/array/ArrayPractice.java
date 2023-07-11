package array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String args[]) {
        final int[] ar = new int[]{2, 5, 1, 6, 7, 4, 9, 10};
        int n = ar.length;
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        int max = longestConsecutive(ar);
        System.out.println(max);
    }

    public static int longestConsecutive(int[] A) {
        int max = 0;
        int n = A.length;
        int curLength = 1;
        Arrays.sort(A);
        for (int i = 1; i < n; i++) {
            if (A[i] == A[i - 1] + 1) {
                curLength++;
            } else if (A[i] == A[i - 1]) {
                continue;
            } else if (A[i] != A[i - 1] + 1) {
                curLength = 1;
            }
            if (curLength > max) {
                max = curLength;
            }
        }
        return max;
    }
}
