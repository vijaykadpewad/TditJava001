package Arraypack;

public class NoOfOccuranceChar {
    /*public static void main(String[] args) {
           String str = "learnjava";
           int count[] = new int[256];
          // int len = str.length();
           for (int i = 0; i < str.length(); i++){
               count[str.charAt(i)]++;}
           char ch[] = new char[str.length()];
           for (int i = 0; i < str.length(); i++) {
               ch[i] = str.charAt(i);
               int c = 0;
               for (int j = 0; j <= i; j++) {
                   if (str.charAt(i) == ch[j])
                       c++;}
               if (c == 1)
                   System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);}
       }*/
public static void main(String[] args) {
        String str = " vijaykadpewad";
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int c = 0;
            for (int j = 0; j <= i; j++) {
                c++;
            }
            if (c == 1)
                System.out.println("Number of Occurrence of" + str.charAt(i) + " is" + count[str.charAt(i)]);
        }
    }
}


