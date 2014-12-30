package 对象序列化;

import java.io.Serializable;

/*
 * 对象序列化：把内存中的对象，保存在磁盘、网络传输
 * 			【对象-->转换为与平台无关的二进制-->保存到磁盘】
 * 			实现：对象与程序的分离。
 * 
 * 		类的序列化必须实现如下两个接口。
 * 		Serializable 接口：
 * 
 * 		Externalizable 接口：
 * 
 * 反序列化：从IO流中恢复java对象
 * 引用序列化、自定义序列化
 */
public class Person implements Serializable {//实现序列化的接口
	
	private int age;
	private String name;
	
	
	

	public Person(int age,String name) {
		super();
		this.age=age;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
