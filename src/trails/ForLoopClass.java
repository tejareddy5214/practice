package trails;

public class ForLoopClass {
        public static void main(String[] args) {
            for(int i=0;i<5;i++){
                for(int x=0;x<i;x++){
                    System.out.print("  ");
                }
                for(int y=0;y<5-i;y++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

