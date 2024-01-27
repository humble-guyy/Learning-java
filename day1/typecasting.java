package day1;

public class typecasting {
    public static void main(String[] args){
        //automatic on implicit casting
        short sh =12;
        int intData=sh;
        float f1=12.21f;
        double db=f1;
        System.out.println(db);
        System.out.println(intData);
        System.out.println(f1);
        //explicit or manually casting
        int intvar=123456;
        short sh1=(short) intvar;
        System.out.println("int to short"+sh1);
        double db1=12345.56728372;
        float f11=(float) db1;
        System.out.println(f11);
    }
    
}
