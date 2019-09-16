/*
 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 	凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 
 分析：
 1、获取用户输入的n
 2、n%3,0或者2则留下2号，1则是1号
 */
package exercise;
import java.util.Scanner;

public class exercise37 {
	public static void main(String[] args)
	{
		System.out.print("请输入人数n：");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//获取人数
		
		if(n%3==0 || n%3==2)
			System.out.println("最后的留下2号");
		else 
			System.out.println("最后的留下1号");
	}

}
