/*
 ��Ŀ��ȡһ������a���Ҷ˿�ʼ��4��7λ��
 
 ������
 1����ȡ����a
 2��������ת���ַ�������ת�����ַ�����
 3��������Ҷ˿�ʼ��4��7λ
 */
package exercise;
import java.util.Scanner;
public class exercise32 {
	public static void main(String[] args)
	{
		System.out.print("�����벻����7λ��������");
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();//��ȡ����a
		char[] array=(Long.toString(a)).toCharArray();//������ת���ַ�������ת�����ַ�����
		int n=array.length;
		
		System.out.print("����"+a+"���Ҷ˿�ʼ��4��7λΪ��");
		System.out.print(array[n-4]+" "+array[n-5]+" "+array[n-6]+" "+array[n-7]);
		in.close();
	}

}
