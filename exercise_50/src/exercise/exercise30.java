/*
 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 
 分析：
 1、数组长度n不可变，因此需要创建长度为n+1的数组存数据
 2、把该数依次与数组中元素作比较，把较小的数存进数组
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise30 {
	public static void main(String[] args)
	{
		int[] array1= {1,2,3,4,5,6,8,9};//原数组
		int[] array2=new int[array1.length+1];//创建长度为array1.length+1的数组保存数据
		
		System.out.print("请输入一个数:");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();//获取用户输入的数
		
		a:
		for(int i=0;i<array1.length;i++)//标记为a的for循环，遍历array1
		{
			
			
				
			if(array1[i]>number) {  //如果number较小，则先进入array2
				array2[i]=number;
				//后面array2[i+1]=array1[i],角标相差1，原来的for循环无法满足需求
				//故新建for循环，把array1剩下的元素都存到array2中去
				for(int j=i;j<array1.length;j++)
				{
					array2[j+1]=array1[j];
				}
				break a;//打破标记为a的循环，结束存储
			}
			else 
			{
				if(array1[array1.length-1]<=number) {
					//number比array1最后一个元素还大，则把number存到array2的末尾
					array2[array1.length]=number;
				}
				array2[i]=array1[i];
			}
		}
		System.out.println("原数组："+Arrays.toString(array1));
		System.out.print("新数组："+Arrays.toString(array2));
		/*
		for(int y:array2)
		{
			System.out.print(y+" ");//打印新数组
		}
		*/
	}

}
