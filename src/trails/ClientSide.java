package trails;
import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("Client connected!");

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    if (message.equals("End")) break;
                }

                System.out.println("Client disconnected.");

            }

        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}

//import java.io.*;
//import java.net.Socket;
//
//public class ClientSide {
//
//    public static void main(String[] args) {
//        String serverAddress = "127.0.0.1"; // localhost
//        int port = 5000;
//
//        try (
//                Socket socket = new Socket(serverAddress, port);
//                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
//        ) {
//            System.out.println("Connected to server. Type messages. Type 'End' to quit:");
//
//            String line;
//            while ((line = userInput.readLine()) != null && !line.equals("End")) {
//                out.write(line);
//                out.newLine();   // Adds newline, important for reader on other side
//                out.flush();     // Sends data immediately
//            }
//
//            System.out.println("Disconnected from server.");
//
//        } catch (IOException e) {
//            System.err.println("Connection error: " + e.getMessage());
//        }
//    }
//}

//
// // A Java program for a ClientSide
//
//import java.io.*;
//        import java.net.*;
//
//public class ClientSide {
//
//    // initialize socket and input output streams
//    private Socket socket = null;
////    private DataInputStream input = null;
////    private DataOutputStream out = null;
//    private BufferedWriter out = null;
////out.writeUTF(line);
//    private BufferedReader input = null;  // ✅ Recommended
//
//
//    // constructor to put ip address and port
//    public ClientSide(String address, int port)
//    {
//
//        // establish a connection
//        try {
//
//            socket = new Socket(address, port);
//
//            System.out.println("Connected");
//
//            // takes input from terminal
//            input = new BufferedReader(new InputStreamReader(System.in));
//
//            // sends output to the socket
//            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        }
//
//        catch (UnknownHostException u) {
//
//            System.out.println(u);
//        }
//
//        catch (IOException i) {
//
//            System.out.println(i);
//        }
//
//        // string to read message from input
//        String line = "hi\nhello\nit\'s\na\njava\napplication\nEnd";
//
//        // keep reading until "End" is input
//        while (!line.equals("End")) {
//
//            try {
//
////                line = input.readLine();
//                line = input.readLine();
//
//                out.write(line);
//            }
//
//            catch (IOException i) {
//
//                System.out.println(i);
//            }
//        }
//
//        // close the connection
//        try {
//
//            input.close();
//
//            out.close();
//
//            socket.close();
//        }
//
//        catch (IOException i) {
//
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args)
//    {
//
//        ClientSide client
//                = new ClientSide("127.0.0.1", 5000);
//    }
//}
