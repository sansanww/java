/*
 题目：一个偶数总能表示为两个素数之和。
 
 1、获取偶数n
 2、运用for循环，从2至n/2取数值m，如果m为素数，则继续判断n-m是否是素数
 3、若m、n-m均为素数，输出
 */
package exercise;
import java.util.Scanner;

public class exercise44 {
	public static void main(String[] args)
	{
		System.out.print("请输入一个偶数：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//获取该偶数
		
		for(int m=2;m<=n/2;m++)//取数值m
		{
			if(isPrimeNumber(m) && isPrimeNumber(n-m))//m和n-m都是素数
				System.out.println(m+"+"+(n-m)+"="+n);
		}
		in.close();
	}
	
	public static boolean isPrimeNumber(int n)//定义函数，判断n是否素数
	{
		if(n<2)//小于2的数不是素数
			return false;
		boolean flag=true;//标记
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=false;//若能整除，n不是素数
		}
		return flag;
	}

}
