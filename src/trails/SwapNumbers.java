package trails;

public class SwapNumbers {
    public static void main(String[]args){
        int a=20540;
        int b=155844;
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println(a+" "+b);     //using third variable
        //c=a+b;
        //a=c-a;
        //b=c-a;
        //System.out.println(a+" "+b);    //using third variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);   //without third variable "^" XOR variable.
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+" "+b);       //without third variable
    }
}
