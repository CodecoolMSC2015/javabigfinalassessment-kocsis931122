package fileManagement;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		try {
			System.out.println("Client started");
			Socket client = new Socket("localhost", 7777);
			System.out.println("Client connected");

			ObjectInputStream streamFromServer = new ObjectInputStream(client.getInputStream());
			while (true) {

			}

		} catch (IOException e)

		{
			e.printStackTrace();
		}
	}
}