package optimedCodes;

import java.util.*;

public class RocksBags {
    RocksBags(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        int[] rocks ={6,4,3,9,2,4};
        int[] bags = {7,4,5,11,2,5};
        int additionalRocks = 6;
        if(rocks.length != bags.length){
            return;
        }
        HashMap<Integer,Integer> diffWithIndex = new HashMap<>();
        for (int i = 0; i < bags.length; i++) {
            diffWithIndex.put(i,bags[i]-rocks[i]);
        }
        ArrayList<Integer> respArray = new ArrayList<>(diffWithIndex.values());
        Collections.sort(respArray);
        int count =0;
        int sum=0;
        for(int i:respArray){
            sum+=i;
            if(sum>additionalRocks)break;
            count++;

        }
        System.out.println(count);
        Dummy dim = new Dummy();
        System.out.println(dim.give());
    }
}
class Dummy{
    Dummy(){
        System.out.println("Hi");
    }
    int give(){
        return 5;
    }
}
