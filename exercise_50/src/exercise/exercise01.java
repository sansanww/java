/*
 ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
 ��ÿ���µ����Ӷ���Ϊ���٣�
 */
package exercise;
import java.util.Scanner;
public class exercise01 
{
	public static int countrabbit(int n)
	{
		int count=1;
		if(n==1 || n==2)
			return count;
		else 
		{
			count=countrabbit(n-1)+countrabbit(n-2);
			return count;
		}
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.print("�������˽�ڼ����µ�����������");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			System.out.println("��"+n+"����һ����"+countrabbit(n)+"ֻ����");
			
			in.close();
			
		}
	}
	
}
