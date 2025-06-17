import java.util.Collections;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        StringBuffer strb = new StringBuffer();
        strb.append("hello! hi Java");
        for(int i=0;i<strb.length();i++){
            char ch = strb.charAt(i);
            int count =0;
            for(int j=0;j<strb.length();j++){
                if(ch == strb.charAt(j)) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch);
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0)isPrime =false;
            }
            if (isPrime) System.out.print(i+" ");
        }

        sc.close();
    }
}