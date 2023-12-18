import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * This class demonstrates the use of InetAddress to retrieve network-related information.
 */
public class GetNetworkNames {
    public static void main(String[] args) {
        try {
            // a. Get the local host name
            String localHostName = InetAddress.getLocalHost().getHostName();
            System.out.println("Local Host Name: " + localHostName);

            // b. Change the host name to its specific IP address
            InetAddress cincinnatiState = InetAddress.getByName("www.cincinnatistate.edu");
            System.out.println("www.cincinnatistate.edu IP Address: " + cincinnatiState.getHostAddress());

            // c. List all addresses of www.google.com
            InetAddress[] googleAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("www.google.com IP Addresses:");
            for (InetAddress address : googleAddresses) {
                System.out.println(address.getHostAddress());
            }

            // d. Find the IP address of your favorite domain
            InetAddress favoriteDomain = InetAddress.getByName("www.bandcamp.com");
            System.out.println("www.bandcamp.com IP Address: " + favoriteDomain.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
