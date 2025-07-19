package serializationTopic;

import java.io.*;
import java.time.DateTimeException;
import java.util.Date;

public class SerializeDemo {

    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");

            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Employee ei = (Employee) inputStream.readObject();
            System.out.println(ei.name);
            System.out.println(ei.address);
            System.out.println(ei.SSN);
            System.out.println(ei.number);

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}

class Employee implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public String address;
    public transient int SSN;   //in serialization, it will hide
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}