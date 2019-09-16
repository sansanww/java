/*
 题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 
 1、编写递归函数求和
 2、判断n为奇数还是偶数，返回不同的值
 
 import java.util.Scanner;
 */
package exercise;

import java.util.Scanner;

public class exercise39 {
	public static void main(String[] args)
	{
		System.out.print("请输入正整数n：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//获取人数
		System.out.println("结果为："+fun(n));
		
		in.close();
	}
	public static double fun(double n)
	{
		if(n%2==0)//n为偶数
		{
			if(n==2)
				return (double)1/2;
			return 1/n+fun(n-2);//递归求和
		}
		else//n为奇数
		{
			if(n==1)
				return 1;
			return 1/n+fun(n-2);//递归求和
		}
	}

}
