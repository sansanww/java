/*
 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 
 分析：
 1、接受用户输入的正整数
 2、创建一个容量为5的数组
 3、把正整数拆分，按个位、十位、百位、千位、万位依次存进数组
 4、从数组中第五位起，向左边依次判断元素是否为零，如果不为零，
 	则把该元素作为终点，从数组第一个元素开始依次输出
 */
package exercise;
import java.util.Scanner;

public class exercise24 {
	public static void main(String[] args)
	{
		System.out.print("请输入一个不多于5位的正整数：");
		Scanner in=new Scanner(System.in);//接受用户输入
		int input=in.nextInt();
		int n=input;//获取正整数
		int[] number=new int[5];//定义数组储存数据
		
		for(int i=0;i<5;i++)//拆分整数，存进数组
		{
			number[i]=n%10;
			n=n/10;
		}
		
		for(int j=4;j>=0;j--)//从万位开始，依次向左判断
		{
			if(number[j]!=0)//如果最高位有值，则输出结果，并结束for循环
			{
				System.out.println("您输入的是"+(j+1)+"数");
				System.out.print(input+"的逆序结果为：");
				for(int k=0;k<=j;k++)
					System.out.print(number[k]);
				break;
			}
		}
		
		in.close();
	}

}
