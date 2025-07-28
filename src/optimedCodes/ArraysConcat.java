package optimedCodes;

import java.util.ArrayList;
import java.util.List;

public class ArraysConcat {
    public static void main(String[] args) {
        int a[] = {7,9,11,16,20,40};
        int  b[] = {2,6,8,18,21,24,30};
        List list = new ArrayList();
        int ax =0 ;
        int bx = 0;
        while (list.size()<=(a.length+b.length)){
            System.out.println(list);
            if(bx==b.length){
                for (int i = ax; i < a.length; i++) {
                    list.add(a[ax]);
                }
                break;
            }
            else if(ax ==a.length){
                for (int i = bx; i < b.length; i++) {
                    list.add(a[ax]);
                }
                break;
            }
            if(a[ax]>b[bx]){
                list.add(b[bx]);
                bx++;
            }
            else{
                list.add(a[ax]);
                ax++;
            }
        }
        System.out.println(list.toString());
    }
}
