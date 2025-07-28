package optimedCodes;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int x =0;//SecondHighest
        int y =0;//highest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>y){
                x=y;
                y= arr[i];
            }else if(arr[i]>x){
                x= arr[i];
            }
        }
        System.out.println(x);
    }
}
