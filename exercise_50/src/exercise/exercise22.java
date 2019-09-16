/*
 题目：利用递归方法求5!。
 */
package exercise;

public class exercise22 {
	public static void main(String[] args)
	{
		System.out.println("5的阶乘为："+factorial(5));
	}
	public static int factorial(int n)//递归方法求阶乘
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
