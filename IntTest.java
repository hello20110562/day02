public class IntTest{
	public static void main(String args[]){
		//整型常量默认自动转换int类型
		int num =888;
		//大整型常量不会自动转换long整型,如果超出int范围，报错：
		long long1=8888888888888888L;//建议使用大写区分
		long long2=8888888888888888l;
	    int var=013;//八进制整型，以0开头
		int hexNum=0x1E;//十六进制表示整型，以0x，0X开头。
		System.out.println("hexNum:" +hexNum+ "\n var:"+var);
		//二进制表示以0b、0B开头。
		byte byteNum =(byte)0b101111;//强制类型转换可能造成数据溢出
		int intNum =0b101111;
		System.out.println("byteNum:"+byteNum+"\n intNum:"+intNum);
		
		
	}
}