/*
 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 
 分析：
 1、新建长度相同的数组
 2、运用for循环，把原数组的数存进新数组
 */
package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise36 {
	public static void main(String[] args)
	{
		System.out.print("请输入整数的数目n：");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//数组长度
		
		System.out.print("请输入移动的位置数量m（m<n）：");
		Scanner in2=new Scanner(System.in);
		int m=in2.nextInt();//获取m
		
		int[] array1=new int[n]; //创建数组存储输入
		int[] array2=new int[n]; //创建数组存储位置变化之后的值
		
		System.out.print("请输入整数，用空格隔开：");//输入整数
		Scanner in3=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			array1[i]=in3.nextInt();//根据输入，给数组赋值
		}
		System.out.println("你输入的数值："+Arrays.toString(array1));//打印原数组
		
		for(int i=0;i<m;i++)//把array1最后m个数存进array2
		{
			array2[i]=array1[i+n-m];
		}
		for(int j=m;j<n;j++)//把array1前面n-m个数存进array2
		{
			array2[j]=array1[j-m];
		}
		
		System.out.println("排序后的数值："+Arrays.toString(array2));//打印新数组
	
		in1.close();
		in2.close();
		in3.close();
	}
}
