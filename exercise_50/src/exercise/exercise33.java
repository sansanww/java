/*
题目：打印出杨辉三角形（要求打印出10行如下图）  1.程序分析：    
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
···

分析：
1、每一行的首位两个数都是1，每行元素个数与行数相同
2、除首尾两个数以外的数，都是前一行同列元素以及同列元素前一个元素之和
3、递归：函数返回每行的数组，参数是行数
 */
package exercise;

public class exercise33 {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)//打印前十行
		{
			int[] array=fun(i);
			for(int j=0;j<array.length;j++)//打印第i行的数组
			{
				System.out.print(array[j]+" ");
			}
			System.out.println();//换行
		}
	}
	
	public static int[] fun(int n)//利用递归函数，返回第n行的数组
	{
		int[] array=new int[n];//定义数组
		array[0]=1;//第一个元素为1
		array[n-1]=1;//最后一个元素为1
		for(int i=1;i<array.length-1;i++)//去掉首和尾元素
		{
			array[i]=fun(n-1)[i-1]+fun(n-1)[i];//递归
		}
		return array;//返回数组
	}
}
