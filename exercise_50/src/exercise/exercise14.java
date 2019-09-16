/*
 题目：输入某年某月某日，判断这一天是这一年的第几天？
 1、根据年份是否能被4整除，判定是否闰年
 2、建立两个数组，分别储存普通年份和闰年的1-12月的天数
 3、根据月份，用for循环取出数值并求和
 */
package exercise;
import java.util.Scanner;

public class exercise14 {
	public static void main(String[] args)
	{
		System.out.print("请分别输入年月日:");
		Scanner in=new Scanner(System.in);//获取用户输入
		int year=in.nextInt();
		int month=in.nextInt();
		int day=in.nextInt();	
		int date=day;
		//创建储存月份的天数的数组
		int[] leap_year=new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//闰年
		int[] common_year=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//平年
		
		if(year%4==0)
		{
			for(int i=0;i<month-1;i++)//统计month之前月份天数的和
			{
				date+=leap_year[i];
			}
		}
		else
		{
			for(int j=0;j<month-1;j++)
			{
				date+=common_year[j];
			}
		}
		
		System.out.println(month+"月"+day+"日是"+year+"年的第"+date+"天");
				
		in.close();
	}

}
