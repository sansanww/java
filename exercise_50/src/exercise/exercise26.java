/*
 ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ���
 �����һ����ĸһ����������жϵڶ�����ĸ��
 
 ������
 1����������date������һ������
 2����ȡ�û����������time
 3���жϣ��۲��֪T��S�����ظ�����Ҫ����time�ڶ�����ĸ
 		�������ڣ�����ֱ�Ӱ�week������ĸ������date��ÿ��Ԫ�ص�����ĸ���бȽϣ����
 
 
 */
package exercise;
import java.util.Scanner;

public class exercise26 {
	public static void main(String[] args)
	{
		String[] date= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		System.out.print("���������ڼ���Ӣ�ĵ��ʣ�");
		Scanner in=new Scanner(System.in);//�����û�����
		String week=(in.nextLine()).toUpperCase();
		String time="";
		
		for(int i=0;i<7;i++)
		{
			if(date[i].charAt(0)=='T' || date[i].charAt(0)=='S')
			{
				if(date[i].toUpperCase().charAt(1)==week.charAt(1))
					time=date[i];
			}
			else
			{
				if(date[i].toUpperCase().charAt(0)==week.charAt(0))
					time=date[i];
			}
		}
		System.out.println("Today is "+time);
		
		
		in.close();
	}

}
