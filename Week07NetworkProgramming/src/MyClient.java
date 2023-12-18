import java.io.*;
import java.net.Socket;

/**
 * This class represents a simple client that connects to a server and sends a message.
 */
public class MyClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5555);
             DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
             BufferedReader bin = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Send data to the server using DataOutputStream
            dout.writeUTF("Hello, Server!");

            // Receive and print the response
            String response = bin.readLine();
            System.out.println("Server Response: " + response);
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
