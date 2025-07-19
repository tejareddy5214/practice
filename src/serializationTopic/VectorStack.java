package serializationTopic;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

class VectorStack{
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Practice");
        vector.add("Collections");
        vector.add(1);
        vector.addFirst("Vector");
        vector.addLast("Coding");
        System.out.println("Vector :"+vector.toString());
        Stack stack = new Stack();
        stack.push("Practice");
        stack.push("Collections");
        stack.push("Stack");
        stack.addFirst("Vector");
        stack.addLast("Coding");
        System.out.println("Stack :"+stack.toString());
        System.out.println(stack.pop()); //will remove last item from stack and returns
        System.out.println(stack.peek());//show top stack element
        stack.push("Coding");
        Iterator itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Enumeration enumeration = stack.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }
        HashMap set = new HashMap();
        set.put(1,5);
        set.put(2,6);
        set.put(3,5);
        set.put(4,6);
        System.out.println(set.toString());
    }
}
