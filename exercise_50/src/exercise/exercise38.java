/*
 ��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�
 
 ������
 1����ȡ�ַ���
 2�����ַ�������ַ����飬�������
 */
package exercise;
import java.util.Scanner;

public class exercise38 {
	public static void main(String[] args)
	{
		System.out.print("������һ���ַ���");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();//��ȡ����
		
		System.out.println("�ַ���\""+str+"\"������"+(str.toCharArray()).length);
	}

}
