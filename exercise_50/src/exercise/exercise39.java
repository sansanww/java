/*
 ��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
 ������nΪ����ʱ�����ú���1/1+1/3+...+1/n(����ָ�뺯��)
 
 1����д�ݹ麯�����
 2���ж�nΪ��������ż�������ز�ͬ��ֵ
 
 import java.util.Scanner;
 */
package exercise;

import java.util.Scanner;

public class exercise39 {
	public static void main(String[] args)
	{
		System.out.print("������������n��");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//��ȡ����
		System.out.println("���Ϊ��"+fun(n));
		
		in.close();
	}
	public static double fun(double n)
	{
		if(n%2==0)//nΪż��
		{
			if(n==2)
				return (double)1/2;
			return 1/n+fun(n-2);//�ݹ����
		}
		else//nΪ����
		{
			if(n==1)
				return 1;
			return 1/n+fun(n-2);//�ݹ����
		}
	}

}
