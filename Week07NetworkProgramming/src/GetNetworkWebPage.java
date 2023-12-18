import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class demonstrates how to download a web page from a given URL and save it to a file.
 */
public class GetNetworkWebPage {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Syntax error with URL and filename");
            return;
        }

        String urlString = args[0];
        String outputFilename = args[1];

        try {
            // Create a URL object from the specified URL string
            URL url = new URL(urlString);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("Web page downloaded successfully.");
            } catch (IOException e) {
                System.err.println("An I/O error occurred: " + e.getMessage());
            }
        } catch (MalformedURLException e) {
            System.err.println("The specified URL is malformed: " + e.getMessage());
        }
    }
}
