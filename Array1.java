package Arraypack;

public class Array1 {  public static void main(String[] args) {
    int[] dArray= new int[10];
    // double[] dArray={}
    dArray[0]=10;
    dArray[1]=144;
    dArray[2]=122;
    dArray[3]=111;
    dArray[4]=19;
    dArray[5]=18;
    dArray[6]=15;
    dArray[7]=11;
    dArray[8]=11;
    dArray[9]=11;
    for(int i:dArray)

        System.out.println(i);
}

}

 class testing {
     public static void main(String[] args) {
         int arr[] = {8, 1, 4, 5, 9, 3};
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
             }
             System.out.println("dssending" + arr[i]);
         }
         for (i = 0; i < rr; i++) {
             for (j = i + 1; j < rr; j++) {
                 if (arr[i] > arr[j]) {
                     k = arr[i];
                     arr[i] = arr[j];
                     arr[j] = k;

                 }
             }
             System.out.print("Assending"+ arr[i]);
         }
             }


         }

