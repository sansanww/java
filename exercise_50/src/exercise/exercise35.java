/*
 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 
 1、获取数组
 2、分别第一个元素和数组其余元素比较，最大的放第一个位置，最后一个元素同理
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise35 {
	public static void main(String[] args)
	{
		System.out.print("请输入数组长度：");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//数组长度
		int[] array=new int[n]; //创建数组
		
		System.out.print("请输入数组，用空格隔开：");//输入数组
		Scanner in2=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			array[i]=in2.nextInt();//根据输入，给数组赋值
		}
		System.out.println("原数组："+Arrays.toString(array));//打印原数组
		
			for(int i=0;i<n;i++)
			{
				if(array[0]<array[i])//最大的放第一个位置
				{
					int temp=array[0];
					array[0]=array[i];
					array[i]=temp;
				}
				if(array[n-1]>array[i])//最小的放最后一个位置
				{
					int temp=array[n-1];
					array[n-1]=array[i];
					array[i]=temp;
				}
			}
		System.out.println("排序后数组："+Arrays.toString(array));//打印排序后的数组
		
		in1.close();
		in2.close();
	}

}
