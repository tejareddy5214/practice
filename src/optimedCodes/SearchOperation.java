package optimedCodes;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchOperation {
    public static void main(String[] args) {
        String s = "ksbhbhjbkkljdsnmlnmccjnjsnjns";
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                arr[s.charAt(i)-97]++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < s.length() ; i++) {
            if(arr[s.charAt(i)-'a']!=0){
                System.out.println("letter : "+s.charAt(i)+" repeated " +arr[s.charAt(i)-'a']+"times");
                arr[s.charAt(i)-'a']=0;
            }
        }
//        Teja te = (a, b)->((6*a)/(b*4));
//        System.out.println(te.getResult(13,3));
    }
}
@FunctionalInterface
interface Teja{
    int getResult(int x,int y);
}