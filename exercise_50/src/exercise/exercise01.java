/*
 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 问每个月的兔子对数为多少？
 */
package exercise;
import java.util.Scanner;
public class exercise01 
{
	public static int countrabbit(int n)
	{
		int count=1;
		if(n==1 || n==2)
			return count;
		else 
		{
			count=countrabbit(n-1)+countrabbit(n-2);
			return count;
		}
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.print("请问想了解第几个月的兔子总数：");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			System.out.println("第"+n+"个月一共有"+countrabbit(n)+"只兔子");
			
			in.close();
			
		}
	}
	
}
