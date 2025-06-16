package trails;
class Pri{
    public boolean checkingPrime(double g){
        int ggv;
        ggv = (int) g;
        int x=0;
        for(int j=1;j<=ggv;j++){
            if ((ggv % j) == 0) {
                x++;
            }

        }
        if (x == 2) return true;
        else return false;

    }
}

public class CheckPrime {
    public static void main(String[] args){
        int num = 51;
        int count =0;
        if(num%2==0) {
            count++;
        }
        double x=(int) Math.sqrt(num);
        Pri primeNum = new Pri();
        if(primeNum.checkingPrime(x)){
            System.out.println("It's prime");
        }
        System.out.println(primeNum.checkingPrime(x));
    }
}
