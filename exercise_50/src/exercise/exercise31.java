/*
 题目：将一个数组逆序输出。
 */
package exercise;
import java.util.Arrays;

public class exercise31 {
	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("原数组： "+Arrays.toString(array));//原数组
		
		System.out.print("逆序数组：[");
		
		for(int i=array.length-1;i>=0;i--)//从最后一个元素遍历到第一个元素
		{
			if(i==0)
			{
				System.out.print(array[i]+"]");//打印到原数组的第一个元素，不用逗号
			}
			else 
			{
				System.out.print(array[i]+", ");
			}
		}
	}

}
