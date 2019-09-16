/*
 题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的*。
 */
package exercise;
import java.util.Scanner;

public class exercise47 {
	public static void main(String[] args)
	{
		System.out.print("请输入7个50以内的正整数，用空格隔开：");
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			fun(in.nextInt());//根据用户输入，打印*
		}
		
		in.close();
	}
	public static void fun(int n)//定义函数，打印出n个*
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
