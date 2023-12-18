# NetworkExplorer

## Overview

NetworkExplorer is a Java project that explores various network programming concepts, demonstrating functionalities such as InetAddress, sockets, and web page downloading. The project consists of multiple Java files to showcase different aspects of network programming.

## Project Structure

1. **GetNetworkNames.java (20 points):**
   - Demonstrates the use of InetAddress.
   - Functionality:
      a. Gets the local host name and displays it on the screen.
      b. Converts the host name of www.cincinnatistate.edu to its specific IP address.
      c. Lists all addresses of www.google.com.
      d. Finds the IP address of a specified favorite domain and displays it on the screen.

2. **MyClient.java and MyServer.java (10 points):**
   - Demonstrates the use of sockets to display a message to a single client.
   - Uses port# 5555.

3. **GetNetworkWebPage.java (20 points):**
   - Reads and downloads a webpage.
   - Receives two parameters: URL and output file.
   - Displays an error message for syntax errors or malformed URLs.
   - Handles IOExceptions and displays appropriate error messages.
   - Reference: Optional exercise DownloadCStateHTML example.

4. **Error Handling (10 points):**
   - The program checks for various error processing scenarios.

5. **Naming Conventions (10 points):**
   - The program follows proper naming conventions as per the course.

6. **Testing (10 points):**
   - Test the program and provide a print-screen of the test results.

7. **Documentation (10 points):**
   - Proper program documentation and comments.
   - All methods have the proper JavaDoc comments.

8. **Generate JavaDoc (10 points):**
   - Generate JavaDoc for the project and provide a print-screen with your submission.

## Usage

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/NetworkExplorer.git
