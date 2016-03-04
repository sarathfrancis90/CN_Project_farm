

package ServerPackage;


/**
 * Created by sarathfrancis on 3/3/16.
 */

import java.io.*;
import java.net.*;

public class Server {

    public static void main (String[] args) throws Exception {
        Server server = new Server();
        server.run();

    }

    public void run () throws Exception {

        ServerSocket serverSocket = new ServerSocket(3800);
        Socket socket = serverSocket.accept();
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String message = bufferedReader.readLine();
        System.out.println(message);


        if(message != null) {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println("Server received the message");
        }


    }
}
