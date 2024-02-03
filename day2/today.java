package day2;
import java.util.*;
public class today {
    public static void main(String[] args){
    int num1=5;
    int num2=6;
    int result=num1+num2;
    System.out.println(result);
    boolean res=3!=2;
    int num3=7;
    System.out.println(res);
    System.out.println(2>2 && 2!=3);
    System.out.println(2>2 & 2!=3);
    System.out.println(num1<num2 && num2++>num3);
    System.out.println(num1<num2 & num2++>num3);
//in logical operator if condition is not satisfied at very first stage it won't
//proceed further but in binary operator it will first calculate all stages and then compute the answer

    }
}
