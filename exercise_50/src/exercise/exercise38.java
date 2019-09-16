/*
 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 
 分析：
 1、获取字符串
 2、把字符串变成字符数组，输出长度
 */
package exercise;
import java.util.Scanner;

public class exercise38 {
	public static void main(String[] args)
	{
		System.out.print("请输入一串字符：");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();//获取人数
		
		System.out.println("字符串\""+str+"\"长度是"+(str.toCharArray()).length);
	}

}
