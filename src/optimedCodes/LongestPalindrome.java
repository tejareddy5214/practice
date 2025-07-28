package optimedCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
//        String s = "jkfnsjkkaklsnflk";
//        Map<Character,Integer> mapping = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            mapping.computeIfAbsent(s.charAt(i),key->0);
//            mapping.replace(s.charAt(i),mapping.get(s.charAt(i))+1);
//        }
//        System.out.println(mapping.toString());
//        int count =0;
//        boolean isOddPresent = false;
//        for(int i: mapping.values()){
//            if(i%2==0){
//                count+=i;
//            }
//            else{
//                isOddPresent=true;
//                count+=i-1;
//            }
//        }
//        System.out.println(isOddPresent?count+1:count);
        char[] chars = "aaabbbbb".toCharArray();
        int maxPalindrome = 0;
        boolean haveOddCount =false;
        for(int i=0;i< chars.length;i++){
            if(chars[i]!='*'){
                int count =1;
                for (int j = i+1; j < chars.length; j++) {
                    if(chars[i]==chars[j]){
                        count++;
                        chars[j]='*';
                    }
                }
                if(count%2==0) {
                    maxPalindrome += count;
                }else{
                    maxPalindrome+=count-1;
                    haveOddCount = true;
                }
            }
        }
        System.out.println(haveOddCount?maxPalindrome+1:maxPalindrome);
    }
}
