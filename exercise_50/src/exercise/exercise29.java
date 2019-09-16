/*
 题目：求一个3*3矩阵对角线元素之和
 
 1、创建3*3矩阵
 2、用for循环分别取出向左和向右对角线的元素，求和
 */
package exercise;

public class exercise29 {
	public static void main(String[] args)
	{
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};//3*3矩阵
		int[] right=new int[3];//存储右对角线元素
		int[] left=new int[3];//存储左对角线元素
		int sum=0;
		
		for(int i=0,j=2;i<3;i++,j--)//取对角线元素
		{
			sum+=matrix[i][i];//取出右对角线元素
			if(i!=1)
				sum+=matrix[i][j];//取出左对角线元素，排除最中间一行的重复值
			
		}
		System.out.println("3*3矩阵对角线元素之和为："+sum);
	}

}
