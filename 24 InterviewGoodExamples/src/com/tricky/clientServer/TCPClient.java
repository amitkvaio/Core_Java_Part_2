package com.tricky.clientServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("<<<<<<<TCPClient>>>>>>>>");
			Socket socket = new Socket("localhost", 8888);
			DataInputStream inStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String clientMessage = "", serverMessage = "";
			while (!clientMessage.equals("bye")) {
				clientMessage = br.readLine();
				outStream.writeUTF(clientMessage);
				outStream.flush();
				serverMessage = inStream.readUTF();
				System.out.println("From Server: " + serverMessage);
			}
			outStream.close();
			outStream.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
