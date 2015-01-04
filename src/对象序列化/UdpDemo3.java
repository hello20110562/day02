
/*
 * 编写聊天程序，收发信息同步进行，多线程：一个线程控制收，一个线程控制发！
 */
import java.io.*;
import java.net.*;


public class UdpDemo3 {


	public static void main(String[] args) throws IOException {
		
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receSocket = new DatagramSocket(10008);
		
		new Thread(new Send(sendSocket)).start();
		new Thread(new Rece(receSocket)).start();
		
	}

}
/*
 * 需求：收信端在接受信息后能够发送回复信息
 * 因为收发动作是不一致的，所以要定义两个run方法，而且要封装到不同的类中
 */
 class Send implements Runnable{
	private  DatagramSocket ds;
	Send(DatagramSocket ds){
		this.ds=ds;
	}
	public void run(){
		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while ((line=bufr.readLine())!=null) {
				if ("886".equals(line)) 
					break;
					
				byte[] buf=line.getBytes();
				
				DatagramPacket dap=new DatagramPacket(buf, buf.length,
						InetAddress.getByName("10.205.1.24"),10001);
				ds.send(dap);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("发送端失败");
		}
	}
} 
class Rece implements Runnable{
	private  DatagramSocket ds;
	public Rece(DatagramSocket ds){
		this.ds=ds;
	}
	public void run(){
		try {
			while (true) {
				byte [] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				String ip=dp.getAddress().getHostAddress();
				
				String data=new String(dp.getData(),0,dp.getLength());
				
			System.out.println(ip+"::"+data);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("接受失败");
		}
	}
}
