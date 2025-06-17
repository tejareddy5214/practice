package trails;
//import java.io.*;
//import java.security.PermissionCollection;
//import java.sql.SQLOutput;
//
//public class PermissionClass{
//    public static void main(String[] args) throws IOException {
//        String srg = "E:\\javas.txt";
//        File file = new File(srg);
//        file.createNewFile(); // This actually tries to create the file
//
//        FilePermission file1 = new FilePermission("E:\\-", "read");
//        PermissionCollection permission = file1.newPermissionCollection();
//        permission.add(file1);
//        FilePermission file2 = new FilePermission(srg, "write");
//        permission.add(file2);
//        if(permission.implies(new FilePermission(srg, "read,write"))) {
//            System.out.println("Read, Write permission is granted for the path "+srg );
//        }else {
//            System.out.println("No Read, Write permission is granted for the path "+srg);
//        }
//        System.out.println(new FilePermission(srg, "read,write"));
//    }
//}
import java.io.Console;
import java.util.Arrays;

public class PermissionClass {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available.");
            return;
        }
        String name = console.readLine("Enter your name: ");
        char[] passworde = console.readPassword("Enter password: ");
        console.printf("Welcome, %s\n", name);
        console.printf(Arrays.toString(passworde));
    }
}
