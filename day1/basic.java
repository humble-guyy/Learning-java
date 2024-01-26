package day1;
import java.util.*;
public class basic{
    public static void main(String[] args){
        String fname="Shivam";
        String name=null;
        name=fname;
        System.out.print(name);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        name=sc.nextLine();
        System.out.print(name);
        sc.close();
    }
}