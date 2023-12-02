package Arraypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private String city;
    private double salary;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String city,double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary=salary;
    }



     //private static List<Arraypack.Employee> User;

     public static void main(String[] args) {
         List<Employee> list  = new ArrayList<>();
         list.add(new Employee(01,"Vijay","Nanded",50000d));
         list.add(new Employee(02,"Sourabh","Latur",87777));
         list.add(new Employee(03,"Anghad","Nanded",44444) );
         list.add(new Employee(04,"Shubham","Latur",58888));
Collections.sort(list);
for(Employee c:list)
         System.out.println(c);
     }

    @Override
    public int compareTo( Employee o) {
        return this.name.compareTo(o.name);
    }
}