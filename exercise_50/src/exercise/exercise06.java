/*
 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

程序分析：利用辗除法。 

这里有一个知识点要记住的，最大公约数和最小公倍数的求法  

1、先求最大公约数bigDivisor

2、就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor
 */

package exercise;

import java.util.Scanner;

public class exercise06 {
	public static void main(String[] args)
	{
		System.out.print("请分别输入两个正整数：");
		Scanner in = new Scanner(System.in);
		
		divisors_multiples(in.nextInt(),in.nextInt());//调用函数求最大公约数和最小公倍数
		in.close();
	}
	
	public static void divisors_multiples(int n1,int n2)
	{
		//求得n1和n2中较小的一个值
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		//运用for循环，除数从min自减到1，求出最大公约数则停止循环
		for(int divisors=min;divisors>0;divisors--)
		{
			if(n1%divisors==0 && n2%divisors==0)
			{
				System.out.println(n1+"和"+n2+"的最大公约数是："+divisors);
				int multiples=n1*n2/divisors;
				System.out.println(n1+"和"+n2+"的最小公倍数是："+multiples);
				break;
			}
		}
	}
}
