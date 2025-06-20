package trails;


import java.lang.reflect.*;

class TestClass{
    public static void main(String[] args)throws Exception {
        Class c=Class.forName(args[0]);

        System.out.println("Fields........");
        Field f[]=c.getDeclaredFields();
        for(int i=0;i<f.length;i++)
            System.out.println(f[i]);

        System.out.println("Constructors........");
        Constructor con[]=c.getDeclaredConstructors();
        for(int i=0;i<con.length;i++)
            System.out.println(con[i]);

        System.out.println("Methods........");
        Method m[]=c.getDeclaredMethods();
        for(int i=0;i<m.length;i++)
            System.out.println(m[i]);
    }
}

//public class TestClass {
//    public static void main(String[] args){
//        System.out.println("Hello World");
//        String[] x ={};
//        MyJavap myJavap = new MyJavap();
//        myJavap.mains(x);
//    }
//}