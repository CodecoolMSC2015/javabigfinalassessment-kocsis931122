package fileManagement;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket {
	DataReader store;
	ServerSocket serversocket;

	public void start() {

		try {
			System.out.println("Server started");
			serversocket = new ServerSocket(7777);
			System.out.println("Waiting...");
			Socket server = serversocket.accept();
			System.out.println("Client cnx accepted");
			ObjectOutputStream streamToClient = new ObjectOutputStream(server.getOutputStream());
			while (true) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PersonStoreServerSocket server = new PersonStoreServerSocket();
		server.start();
	}
}