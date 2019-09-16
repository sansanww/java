/*
	题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
	再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
	分析：
	1、每次落地弹起的高度：
		1：h/2
		2:h/4
		...
		n:h/Math.pow(2,n)
	2、第一次落地经过的路程为h
		第n次(n>1)落地经过的路程：h+2*(h/2+h/4+...+h/Math.pow(2,n-1))
	3、定义一个for循环，计算第n次落地经过的路程
		
 */

package exercise;
import java.util.Scanner;

public class exercise10 {
	public static void main(String[] args)
	{
		System.out.print("请输入h和n：");
		Scanner in=new Scanner(System.in);
		double h=in.nextDouble();
		int n=in.nextInt();
		
		double bounce=h/Math.pow(2,n);//第n次弹起的高度
		double journey=h;//路程初始化为h
		if(n!=1)//n>1的时候再进行for循环,计算第n次落地经过的路程
		{
			for(int i=1;i<n;i++)//
			{
				journey+=2*h/Math.pow(2,n-1);
			}
		}
		
		System.out.println("第"+n+"次落地，共经过"+String.format("%.2f",journey)+"米");
		System.out.println("第"+n+"次反弹，有"+String.format("%.2f", bounce)+"米高");
		
		in.close();
	}

}
