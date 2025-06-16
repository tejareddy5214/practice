package trails;
//class Sumof{
//    public int newSum(int gh){
//        int sumGH = gh%10+gh/10;
//        return sumGH;
//    }
//    public int summation(int i){
//        int m=0;
//        int sumN=0;
//        while(i>=1){
//            m=i%10;
//            i=i/10;
//            sumN=sumN+m;
//            if (sumN>10) sumN = newSum(sumN);
//        }
//        return sumN;
//    }
//}
public class SumToSingleDigit {
    public static void main(String[] args){
        int i=545;
        int m=0;
        int sumN=0;
        while(i>=1){
            m=i%10;
            i=i/10;
            sumN=sumN+m;
            if(sumN>10){
                sumN=sumN%10+sumN/10;
            }
        }
        System.out.print(sumN);
//        Sumof sumv = new Sumof();
//        int x=9999956;
//        int m=sumv.summation(x);
//        while(m>=9){
//            System.out.println("hi");
//            m = sumv.summation(m);
////            if (m<=9){
////                System.out.println(sumv.summation(x));
////            }
////            else{
////                System.out.println(m);
////            }
//        }
//        System.out.println(m);

    }
}
