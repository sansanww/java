/*
 ��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ������*��
 */
package exercise;
import java.util.Scanner;

public class exercise47 {
	public static void main(String[] args)
	{
		System.out.print("������7��50���ڵ����������ÿո������");
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			fun(in.nextInt());//�����û����룬��ӡ*
		}
		
		in.close();
	}
	public static void fun(int n)//���庯������ӡ��n��*
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
