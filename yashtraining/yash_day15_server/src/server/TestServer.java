package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {

	public static final int SERVER_PORT=4400;
	public static void main(String[] args) {
		System.out.println("Waiting for client connection.........");
		try(Scanner sc=new Scanner(System.in);
				ServerSocket ss=new ServerSocket(SERVER_PORT,3);
				Socket s=ss.accept())
		{
			System.out.println("Connected from client : "+s.getInetAddress().getHostName());
			System.out.println("client port : "+s.getPort());
			try(DataOutputStream dos=new DataOutputStream(s.getOutputStream());
					DataInputStream dis=new DataInputStream(s.getInputStream()))
			{
				System.out.println("server : client sent "+dis.readUTF());
				dos.writeUTF("I am good ! bye for now kutta");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
