package array;

public class ReverseArray {
    public static void main(String args[]) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        reverseArr(ar, a, b);
        System.out.println("After reversal:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }

    //reverses array from index i to index j.
    private static void reverseArr(int[] ar, int a, int b) {
        int temp = 0;
        for (int i = a, j = b; i <= j; i++, j--) {
            temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;

        }
    }
}
