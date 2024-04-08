package day5;

import java.util.Arrays;

public class basics{
    public static void main(String[] args){
        //this is a comment
        //revising java basics today
    /*this is multiline
     * comment
     */
    System.out.println("Hello World");
    System.out.print("this will be printed in the same line");

    //variables
    String name="Pranjal";
    String neighbour="Aryan";
    int age=30;
    String friend=neighbour;

    //TYPES

    //primitive-simple values
    //BYTE -1[-128 to 127]
    /*short-2
     * int-4
     * long-8
     * float-4
     * dobule-8
     * char-2
     * boolean-1
     */
    byte age1=30;
    int phone=1234567890;//adding one more element will make it out of range
    long phone2=1234567890123L;//here we had to use L in the end to tell the compiler that we are storing as long
    float pi=3.14F;//we have to use F/f for float so that java can understand
    char letter ='@';
    boolean isAdult=true;

    //non primitive type-alot of chars
    //they have their own functions for your easyness
    //they don't have the size..they will provide you storage until your system fulls out
    //String

    //concatenation
    String name2="pranjal12";
    String name3="rudra";
    String name4=name2+name3;
    System.out.println(name2+name3);
    System.out.println(name4);

    //charAt()
    //it is a string function to find out the value at particular index
    String name5="hello world!";
    System.out.println(name5.charAt(0));

    //length()
    //it gives the length of the string
    System.out.println(name5.length());

    //replacing characters
    //using replace()
    String name6=name5.replace('l','a');
    System.out.println(name6);//output-heaao worad!!

    //Strings are immutable in java

    //substring()--finding smaller part from big string;
    String n="Aman and pranjal";
    System.out.println(n.substring(0, 4));//output-aman
    //it works for (n,n-1) and as per indexing

    







    //arrays -non primitive datatypes
    int[] marks = new int[3];
    marks[0] = 97;
    marks[1]=98;
    marks[2]=95;
    System.out.println(marks[0]);
    //System.out.println(marks[0],marks[1]); this will give error because in java you cannot print 2 variables in a single sout else you have to use concatenation of strings
    /*
     * This is a method to print out two variables in a single line
     * int a =5
     * int b=10
     * System.out.print(a+ " ");
     * System.out.print(b);
     */
    int[] list=new int[3];
    System.out.println(list[2]);//output will be zero..even if we didn't give the value it will give 0 as output

    boolean[] list1=new boolean[3];
    System.out.println(list1[2]);//output will be--false and make sure that both of them must have seperate name even if their type is same but still you cannot give them same name
    
    //functions in arrays
    //length

    System.out.println(marks.length);//here we will not use() because in arrays it is not a function it is its property
    

    //sort
    System.out.println(marks[0]);//marks array before sorting-97-98-95
    Arrays.sort(marks);
    System.out.println(marks[0]);//marks array after sorting-95-97-98


    //how to create a array when we already know the values for the array otherwise we had to use "new " keyword
    int[] aryan={97,95,98};
    int[][] pranjal={{1,2,3},{4,5,6}};
    System.out.println(pranjal[1][1]);//this is a 2D array
    //when you don't know the values the 2D array will be formatter like
    //int[][] marks= new int[3][3];
    System.out.println(aryan[4]);
    }
}