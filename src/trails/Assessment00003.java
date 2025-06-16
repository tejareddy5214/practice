package trails;

public class Assessment00003 {
    public static void main(String [] args){
        int v=56554445;
        int i=1;
        int m=0;
        while ( v>=1){
            int x=v%10;
            v=v/10;
            m=m*10+x;
        }
        System.out.println(m);
//        String s="good morning";
//        int l=s.length();
//        for (int i = l-1; i >= 0; i--){
//            System.out.print(s.charAt(i));
//        }

    }
}
//wap  to reverse the number.
