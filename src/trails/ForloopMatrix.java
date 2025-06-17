package trails;

public class ForloopMatrix {
    public static void main(String[] args) {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J'};
        for(int i=0;i<3;i++){
            for(int x=0;x<3;x++){
                /*System.out.print(alphabet[i*3+x]+" "); //without unicode: */
                char letter = (char) ('A' + i * 3 + x);
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}
