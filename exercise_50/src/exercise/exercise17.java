/*
 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，
 	又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 	以后每天早上都吃了前一天剩下的一半零一个。
 	到第10天早上想再吃时，只剩下一个桃子了。
 	求第一天共摘了多少。
 分析：
 1、假设摘了n只桃子
 2、第一天桃子数：n,第二天桃子数：n/2-1。由于计算公式都是一样的，可以从后面一天的桃子数倒推前一天的桃子数
 	即后一天桃子数*+2
 3、可以定义函数，利用递归的思维，把桃子数作为返回值，把天数作为参数
 */
package exercise;

public class exercise17 {
	public static void main(String[] args)
	{
		System.out.println(peachnumber(1));//函数返回第一天的桃子树，打印
	}
	
	public static int peachnumber(int n)
	{
		if(n==10)
			return 1;
		return peachnumber(n+1)*2+2;
	}
}


