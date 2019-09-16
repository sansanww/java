/*
 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
 60-89分之间的用B表示，60分以下的用C表示。
 */
package exercise;
import java.util.Scanner;

public class exercise05 {
	public static void main(String[] args)
	{
		System.out.print("请输入0-100之间的分数：");
		Scanner in = new Scanner(System.in);
		double grade=in.nextDouble();//设定为double类型，无论分数带不带小数点，都可以接收
		//先判断分数范围是否超出，然后评定等级
		if(grade<0 || grade>100)
			System.out.println("分数超出范围！");
		else if(grade>=90)
			System.out.println("分数等级为A");
		else if(grade>=60)
			System.out.println("分数等级为B");
		else
			System.out.println("分数等级为C");
		
		in.close();
	}

}
