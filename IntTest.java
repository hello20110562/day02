public class IntTest{
	public static void main(String args[]){
		//���ͳ���Ĭ���Զ�ת��int����
		int num =888;
		//�����ͳ��������Զ�ת��long����,�������int��Χ������
		long long1=8888888888888888L;//����ʹ�ô�д����
		long long2=8888888888888888l;
	    int var=013;//�˽������ͣ���0��ͷ
		int hexNum=0x1E;//ʮ�����Ʊ�ʾ���ͣ���0x��0X��ͷ��
		System.out.println("hexNum:" +hexNum+ "\n var:"+var);
		//�����Ʊ�ʾ��0b��0B��ͷ��
		byte byteNum =(byte)0b101111;//ǿ������ת����������������
		int intNum =0b101111;
		System.out.println("byteNum:"+byteNum+"\n intNum:"+intNum);
		
		
	}
}