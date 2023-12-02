package Arraypack;

public class Array2 {

    public static void main(String[] args) {
        int arr[] = {8, 1, 4, 5, 9, 3};
        // i=  0  1  2  3  4  5
        int rr = arr.length;
        int j;
        int i;
        int k;

        for (i = 0; i < rr; i++) {
            for (j = i + 1; j < rr; j++) {
                if (arr[i] < arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
                System.out.println("largest" + arr[j]);

            }
            for (j = i + 1; j < rr; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
                System.out.println("assending " + arr[i]);

            }
        }


    }
}