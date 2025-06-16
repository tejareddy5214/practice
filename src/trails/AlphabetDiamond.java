package trails;

public class AlphabetDiamond {
    public static void main(String[] args){
        int k=3;
        char f='A';
        for(int i=0;i<k;i++){
            for (int x=0;x<k-i-1;x++){
                System.out.print("  ");
            }
            for (int y=0;y<(2*i+1);y++){
                System.out.print(f+" ");
                f++;
            }
            for (int z=0;z<k-i-1;z++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int j=1;j<k;j++){
            for (int u=0;u<j;u++){
                System.out.print("  ");
            }
            for (int v=0;v<((k-j)*2-1);v++){
                System.out.print(f+" ");
                f++;
            }
            for (int w=0;w<j;w++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
