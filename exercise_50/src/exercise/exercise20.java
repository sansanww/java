/*
 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 求出这个数列的前20项之和。
 
 分析：
 1、观察分子和分母，分子和分母的每一项都是前面两项之和，即n1/m1,n2/m2,(n1+n2)/(m1+m2)
 2、创建递归函数，参数n的返回值等于参数n-1和参数n-2返回值之和
 3、运用for循环，调用函数求出前20项之和
 */
package exercise;

public class exercise20 {
	public static void main(String[] args)
	{
		double sum=0;
		for(int n=1;n<=20;n++)
		{
			sum+=molecular(n)+denominator(n);
		}
		System.out.println("前20项的和为："+sum);
	}
	
	public static int molecular(int n)//定义函数，求分子
	{
		if(n==1)
			return 2;
		if(n==2)
			return 3;
		return molecular(n-1)+molecular(n-2);//递归，把n-1和n-2项的和作为返回值
	}
	
	public static int denominator(int n)//定义函数，求分母
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return denominator(n-1)+denominator(n-2);//递归，把n-1和n-2项的和作为返回值
	}
}
