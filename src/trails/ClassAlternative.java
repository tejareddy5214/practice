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
            Class c=Class.forName("trails.Formultiples");
            Simple s=(Simple)c.newInstance();
            out.println(s.message());
        }
        catch(Exception err){
            out.println(err);
        }

    }
}
