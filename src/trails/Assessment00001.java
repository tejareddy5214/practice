package trails;

public class Assessment00001 {
    public static  void main(String[] args){
        int y=0;
        int z=1;
        System.out.print(0+" "+1+" ");
        for (int i=0;i<=100;i++){
            int m=y+z;
            System.out.print(m+" ");
            y=z;
            z=m;
        }
    }
}
//wap to print Fabinocci series.
