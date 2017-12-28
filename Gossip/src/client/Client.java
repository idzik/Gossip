package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static final int PORT = 50007; 
	public static final String HOST = "127.0.0.1"; 

	public static void main(String[] args) throws IOException {
		Socket sock;
		sock = new Socket(HOST, PORT);
		
		System.out.println("Nawi¹zano po³¹czenie : " + sock);
		
		BufferedReader keyboardText;
		keyboardText = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter outp;
		outp = new PrintWriter(sock.getOutputStream());
		
		System.out.println("<Wysy³am>");
		String message = keyboardText.readLine();
		outp.println(message);
		outp.flush();
		
		
		sock.close();
		keyboardText.close();
		outp.close();

	}

}
