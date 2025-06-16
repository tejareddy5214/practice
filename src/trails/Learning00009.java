import java.util.Arrays;

//import static java.util.Arrays;

class Learning00009{
    public static void main(String[] args){
        int[] arr = {10,6,10};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-2; true; i--){
//            System.out.println(i);
            if(arr[i]!=arr[arr.length-1]){
                System.out.println(arr[i]);
                break;
            }
            else if(arr[0]==arr[arr.length-1]){
                System.out.println("Not Possible");
                break;
            }
        }
    }
}