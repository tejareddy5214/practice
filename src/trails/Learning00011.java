package trails;

import java.util.Arrays;
import java.util.Scanner;

public class Learning00011 {
    public static void main(String[] args){
        int intia=1;
        int[][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = intia*5;
//                System.out.print(intia*5+" ");
                intia+=1;
            }
            System.out.println();
        }

        System.out.print(Arrays.deepToString(arr));
    }

}
