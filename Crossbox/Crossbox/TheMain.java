package Crossbox;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.sql.SQLException;

public class TheMain {
    public static void main(String[] args) throws IOException, SQLException, InterruptedException {
        Socket socket = null;
        try {
//            socket = new Socket("0.tcp.eu.ngrok.io", 10507);
            socket = new Socket("localhost", 8000);
            Client client = new Client(socket);
        } catch (IOException e) {
            int err = JOptionPane.showOptionDialog(null, "Server Down!Please Try Again Later.", "Server Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(err == 0) {
                System.exit(0);
            }
            //e.printStackTrace();
            System.out.println("Server Down");
        }

    }
}
