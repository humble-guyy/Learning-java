package day1;

import java.util.*;

public class userinput {
    public static void main(String[] args){
        //1st method
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your data=");
        //int intdata=scan.nextInt();
        //System.out.println("your entered value is "+intdata);
        //float f1=scan.nextFloat();
        //System.out.println(f1);
        //char ch=scan.next().charAt(0);
        //System.out.println(ch);
        String s1=scan.nextLine();
        System.out.println(s1);
        scan.close();
    }
}
