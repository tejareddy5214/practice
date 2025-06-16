package trails;

public final class Assessment00005 {
    public static void main(String[] args){
        int m=4;
        for(int i=1;i<=m;i++){
            for (int u=0;u<m-i;u++){
                System.out.print(" ");
            }
            for(int v=0;v<2*i-1;v++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//wap to print the
//           *
//          ***
//         *****
//        *******