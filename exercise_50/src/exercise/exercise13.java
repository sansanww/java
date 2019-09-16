/*
 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 
 分析：
 1、尝试给定范围1万，如果没有找到，再扩大范围
 2、先给数i加上100，判断开方的结果和1+100是否相等
 3、加上168的部分同理
 
 */
package exercise;

public class exercise13 {
	public static void main(String[] args)
	{
		for(int i=1;i<10000;i++)
		{
			int num1=(int)Math.sqrt(i+100);
			int num2=(int)Math.sqrt(i+168);
			if(i+100==num1*num1 && i+168==num2*num2)
				System.out.println("完全平方数："+i);
		}
	}

}
