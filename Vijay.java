package Arraypack;

import java.util.Arrays;

public class Vijay {
    Object arr[];
    int s;

    @Override
    public String toString() {
        return "Vijay{" + "arr=" + Arrays.toString(arr) + ", s=" + s +
                ", capacity=" + capacity +
                '}';
    }

    int capacity;

    Vijay() {
        capacity = 10;
        s = 0;
        arr = new Object[capacity];
    }

    void add(Object item) {

        arr[s++] = item;
    }

    Object remove(int index) {
        if (index < 0 || index >= s) {
            throw new IndexOutOfBoundsException("Enter valid index");
        }
        Object removeArr = arr[index];
        for (int i = index; i < s - 1; i++) {
            arr[i] = arr[i + 1];
        }
        s--;
        return removeArr;
    }


    Object get(int index){
        return arr[index];
    }
    int size(){
        return s;
    }
}
 class CustomArrayList {
    public static void main(String[] args) {
        Vijay vk =new Vijay();
        vk.add(1);
        vk.add("Vijay");
        vk.add(23);
        vk.add("Saurabh");
       vk.add(23);
       vk.add("vijay");
        vk.add(23);
        vk.add("vijay");
        vk.add(23);
        vk.add("vijay");
        vk.add("k");

        vk.remove(3);

     for (int i=0;i<vk.size();i++){
        //   System.out.println(vk.get(i));
       }

        System.out.println(vk.toString());

    }
}

