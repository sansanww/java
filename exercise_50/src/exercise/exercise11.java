/*
题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
分析：
	1、运用三层for循环，分别求个十百位，再判断输出
	2、定义一个计数器变量count，计算总数
 */

package exercise;

public class exercise11 {
	public static void main(String[] args)
	{
		int count=0;
		for(int units=1;units<5;units++)
		{
			for(int ten=1;ten<5;ten++)
			{
				for(int hundred=1;hundred<5;hundred++)
				{
					if(units!=ten && units!=hundred && ten!=hundred)
					{
						count++;
						System.out.println(hundred*100+ten*10+units);
					}
				}
			}
		}
		System.out.println("共有"+count+"个数");
		
	}
}
