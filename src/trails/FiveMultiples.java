package trails;

public class FiveMultiples {
    public static void main(String[] args){
        int num = 50;
        for(int i=0;i<=num;i++){
            int m=1;
            do{
                int v=m*i;
                System.out.println(i+" * "+m+" = "+v+" ");
                m++;
            }while(m<=5);
            System.out.println();
        }
    }
}
