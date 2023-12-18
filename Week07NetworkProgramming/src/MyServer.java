import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class represents a simple server that listens for incoming client connections and processes requests.
 */
public class MyServer {
    public static void main(String[] args) {
        System.out.println("Server is running on port 5555...");
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        DataOutputStream dout = null;
        DataInputStream dis = null;

        try {
            // Create a server socket and accept incoming client connections
            serverSocket = new ServerSocket(5555);
            clientSocket = serverSocket.accept();
            dout = new DataOutputStream(clientSocket.getOutputStream());
            dis = new DataInputStream(clientSocket.getInputStream());

            // Receive data from the client using DataInputStream
            String strMessage = dis.readUTF();
            System.out.println("Received from client: " + strMessage);

            // Send a response to the client using DataOutputStream
            dout.writeUTF("Hello, Client!");
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        } finally {
            try {
                // Close resources in the finally block
                if (dout != null) dout.close();
                if (dis != null) dis.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                System.err.println("An error occurred while closing resources: " + e.getMessage());
            }
        }
    }
}
