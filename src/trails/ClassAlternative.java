package trails;
import java.lang.Class;
import static java.lang.System.out;
import static java.lang.Class.forName;

class Simple{
    String message(){return "Hello Java";}
}

public class ClassAlternative{
    public static void main(String[] args){
        try{
            String str ="trails.Formultiples";
            Class c=Class.forName(str);
            Formultiples s = (Formultiples) c.newInstance();
            String[] ag ={};
//            out.println(s.main(ag));
            s.main(ag);
        }
        catch(Exception err){
            out.println(err);
        }

    }
}
