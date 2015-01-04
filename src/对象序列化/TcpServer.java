

import java.io.*;
import java.net.*;
/*
 * 客户端 Socket
 * 
 * 服务端：ServerSoket  S
 * 
 * Socket对象在创建时，就可以连接指定主机  因为tcp是面向连接的，所以在建立socket服务时，就要有服务端存在
 * 
 */

class TcpClient{
	public static void main(String[] args) throws IOException{
		//创建客户端的socket服务，指定目的主机端口
	Socket s=new Socket("10.205.1.56", 10003);
	BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
	OutputStream os=s.getOutputStream();
	int buff=bufr.read();
	os.write(buff);
	s.close();
	}
}
public class TcpServer{
	public static void main(String [] args) throws IOException{
		ServerSocket ss=new ServerSocket(10003);
		
		Socket s=ss.accept();
		
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+".....连进来了");
		
		InputStream is=s.getInputStream();
		
		byte []buff=new byte[1024];
		
		int line=is.read(buff);
		System.out.println(new String(buff,0,line));
		
		s.close();
		
		
 }
}

