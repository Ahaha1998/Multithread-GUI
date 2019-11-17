package week12;

import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
