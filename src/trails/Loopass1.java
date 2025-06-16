package trails;

public class Loopass1 {
    public static void main(String[] args){
        int i=0;
        while(i<5){
            int j=0;
            while (j<5-i-1){
                j++;
                System.out.print(" ");    //s.o.p(
            }
            int k=0;
            while (k<i+1){
                k++;
                System.out.print("*");
            }
            System.out.println();
            i++;

        }

//        for(int x=0;x<5;x++){
//            for(int y=0;y<5-i-1;y++){
//                System.out.print(" ");
//            }
//            for(int y=0)
//        }
    }
}
