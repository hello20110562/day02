public class WellcomTest{
	public static void main(String args[]){
	String[]greeting = new String[3];
	greeting[0] ="Wellcom to Core Java";
	greeting[1] ="by cay huang";
	greeting[2]="and lily huang";
	
	for(String g:greeting)//简化for循环，简化集合迭代
	System.out.println(g);
	//以上语句等同于 
	/*for (int i=0;i<greeting.length;i++)
	System.out.println(greeting[i]);版本过低时无法显示 */
	
	}
}