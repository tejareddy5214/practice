package trails;

public class SumOfDigits {
    public static void main(String[] args){
        int i=5454555;
        int m=0;
        int sumN=0;
        while(i>=1){
            m=i%10;
            i=i/10;
            sumN=sumN+m;
//            if(sumN>10){
//                sumN=sumN%10+sumN/10;
//            }
        }
        System.out.print(sumN);
    }

}
