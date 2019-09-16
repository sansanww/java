/*
 题目：求1+2!+3!+...+20!的和
 
 
 分析：
 1、定义函数，用递归方法求阶乘
 2、运用for循环求上述式子的值
 */
package exercise;

public class exercise21 {
	public static void main(String[] args)
	{
		int sum=0;
		
		for(int i=1;i<=20;i++)//求和
		{
			sum+=factorial(i);
		}
		System.out.println("1+2!+3!+...+20!="+sum);
	}
	public static int factorial(int n)//递归方法求阶乘
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
