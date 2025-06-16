package trails;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] arr = {8,6,5,9,1};
        int l = arr.length;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(arr[l-1-i]<arr[l-1-j]){     
                    int a = arr[l-1-i];
                    arr[l-1-i] = arr[l-1-j];
                    arr[l-1-j] = a;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
        System.exit(0);
    }
}
