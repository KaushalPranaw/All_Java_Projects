package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Enter server IP and Port number");

		try (Scanner sc = new Scanner(System.in); Socket socket = new Socket(sc.next(), sc.nextInt());) {

			System.out.println("Connected To : " + socket.getInetAddress().getHostName());
			System.out.println("Server port : " + socket.getPort() + " " + socket.getLocalPort());

			try (DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					DataInputStream dis = new DataInputStream(socket.getInputStream())) {

				dos.writeUTF("Hello Server How are you");
				System.out.println("client : server sent : " + dis.readUTF());
			}
		}
	}
}
