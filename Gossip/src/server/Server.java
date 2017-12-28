package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static final int PORT = 50007; 

	public static void main(String[] args) throws IOException {
		
		ServerSocket sockServ;
		sockServ = new ServerSocket(PORT);
		
		System.out.println("Nas�uchuje na porcie : " + sockServ);
		
		Socket sock;
		sock = sockServ.accept();
		
		System.out.println("Jest po��czenie : " + sock);
		
		BufferedReader inp;
		inp = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
		String message;
		message = inp.readLine();
		System.out.println("<Message : >" + message);
		
		
		sockServ.close();
		sock.close();
		inp.close();
	}

}
