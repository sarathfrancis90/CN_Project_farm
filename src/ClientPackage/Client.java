package ClientPackage;

/**
 * Created by sarathfrancis on 3/3/16.
 */

import java.io.*;
import java.net.*;

public class Client {

    public static void main (String[] args) throws Exception {

        Client client = new Client();
        client.run();

    }

    public void run() throws Exception {

        Socket socket = new Socket("localhost",3800);
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("Hi Server, from Client");

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String message = bufferedReader.readLine();

        System.out.println(message);

    }
}
