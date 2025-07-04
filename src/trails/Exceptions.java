package trails;

import java.io.*;

public class Exceptions {
    public static void main(String[] args) {
        try(BufferedReader file = new BufferedReader(new FileReader("employee.ser"))){
            calculate(file);
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Input Error");
        }catch (NumberFormatException e){
            System.out.println("TypeCasting Error");
        }
    }
    static void calculate(BufferedReader file)
            throws IOException,FileNotFoundException,NumberFormatException {
        String s = file.readLine();//runtime error
        int n = Integer.parseInt(s); //compilation error
    }
}
