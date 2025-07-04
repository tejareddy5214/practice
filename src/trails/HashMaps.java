package trails;

import java.util.*;
/*
public class HashMaps {
    public static void main(String[] args) {
        String[] str = {"eat","tea","ant","tan","bat","sleep"};
        List<String> sarr = new ArrayList<>(Arrays.asList(str));
        Map<String,String> map = new LinkedHashMap<>();
        for(String x:sarr){
            int l=x.length()-1;
            String y=x.charAt(l)+x.substring(0,l);
            if(!map.containsValue(x)) {
                if(sarr.contains(y)){
                    map.put(x,y);
                }else{
                    map.put(x,"");
                }
            }


        }
        System.out.println(map);
        List<List> resplist = new ArrayList<>();
        map.forEach((k,v)->{
            List<String> templist = new ArrayList<>();
            templist.add(k);
            if(!v.equals("")){
                templist.add(v);
            }
            resplist.add(templist);
        });
        System.out.println(resplist);
    }
}
*/

public class HashMaps {
    public static void main(String[] args) {
        String[] str = {"eat","tea","ant","tan","bat","sleep"};
        List<String> sarr = new ArrayList<>(Arrays.asList(str));
        Map<String,List> map = new LinkedHashMap<>();
        sarr.forEach(x->{
            String tempx = sortingList(x);
            List<String> tempList = new ArrayList<>();
            tempList.add(x);
            if(!map.containsKey(tempx)){
                map.put(tempx,tempList);
            }
            else{
                map.get(tempx).add(x);
            }
        });
        System.out.println(map);
        List<List> resplist = new ArrayList<>();
        map.forEach((k,v)->{
            resplist.add(v);
        });
        System.out.println(resplist);
    }
    static String sortingList(String x){
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        String m = new String(chars);
        return m;
    }
}