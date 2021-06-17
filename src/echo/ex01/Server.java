package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.99",10001)); //IP 포트번호

		System.out.println("<서버시작>");
		System.out.println("-------------------------------");
		System.out.println("[연결을 기다리고 있습니다]");
		
		
		Socket socket = serverSocket.accept();
		System.out.println("[클라인트가 연결되었습니다]");
		
		socket.close();
		
		serverSocket.close();
	}

}
