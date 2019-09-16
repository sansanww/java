/*
 题目：一个5位数，判断它是不是回文数。
 即12321是回文数，个位与万位相同，十位与千位相同。
 
 分析：
 1、拆分正整数，储存进数组
 2、判断个位和万位、十位和千位是否相等
 */
package exercise;
import java.util.Scanner;

public class exercise25 {
	public static void main(String[] args)
	{
		System.out.print("请输入一个5位的正整数：");
		Scanner in=new Scanner(System.in);//接受用户输入
		int input=in.nextInt();
		int n=input;//获取正整数
		int[] number=new int[5];//定义数组储存数据
		
		for(int i=0;i<5;i++)//拆分整数，存进数组
		{
			number[i]=n%10;
			n=n/10;
		}
		
		if(number[0]==number[4] && number[1]==number[3])//判断是否回文数
			System.out.println(input+"是回文数");
		else
			System.out.println(input+"不是回文数");
		
		in.close();
	}

}

