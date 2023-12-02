package Arraypack;

public class SecondArray {
  /*  public static void main(String[] args) {
        int []arr={3,7,5,9,2,6};
        int k;
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
            System.out.println(arr[i]);
        }*/

    public static void main(String[] args) {
        String s = "saurabh ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == (s.charAt(j)) && s.charAt(i) != ' ') {
                    count++;
                    System.out.println("char = " + s.charAt(i) + " and count =" + count);
                }




            }
        }
    }
}
