/*
 输入3个数a,b,c，按大小顺序输出
 
 分析：
 1、获取三个数，存进数组
 2、数组元素排序：把最大元素放在最后，依次往左比较
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise34 {
	public static void main(String[] args)
	{
		System.out.print("请输入三个整数，用空格隔开：");
		Scanner in=new Scanner(System.in);
		int[] array=new int[3]; 
		
		for(int i=0;i<3;i++)//把用户输入的数存进数组
		{
			array[i]=in.nextInt();
		}
		
		
		
		for(int j=0;j<2;j++)
		{
			for(int k=j+1;k<3;k++)
			{
				if(array[j]>array[k])
				{
					int temp=array[j];
					array[j]=array[k];
					array[k]=temp;
				}
			}
		}
		System.out.print("排序结果：");
		for(int i=0;i<3;i++)
		{
			System.out.print(array[i]+" ");//打印排序后的数
		}
		in.close();
	}
}
