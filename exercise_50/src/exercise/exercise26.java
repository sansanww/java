/*
 题目：请输入星期几的第一个字母来判断一下是星期几，
 如果第一个字母一样，则继续判断第二个字母。
 
 分析：
 1、创建数组date储存周一到周日
 2、获取用户输入的日期time
 3、判断：观察可知T和S存在重复，需要读入time第二个字母
 		其余日期，可以直接把week的首字母与数组date中每个元素的首字母进行比较，输出
 
 
 */
package exercise;
import java.util.Scanner;

public class exercise26 {
	public static void main(String[] args)
	{
		String[] date= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		System.out.print("请输入星期几的英文单词：");
		Scanner in=new Scanner(System.in);//接受用户输入
		String week=(in.nextLine()).toUpperCase();
		String time="";
		
		for(int i=0;i<7;i++)
		{
			if(date[i].charAt(0)=='T' || date[i].charAt(0)=='S')
			{
				if(date[i].toUpperCase().charAt(1)==week.charAt(1))
					time=date[i];
			}
			else
			{
				if(date[i].toUpperCase().charAt(0)==week.charAt(0))
					time=date[i];
			}
		}
		System.out.println("Today is "+time);
		
		
		in.close();
	}

}
