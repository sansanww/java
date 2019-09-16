/*
 题目：某个公司采用公用电话传递数据，数据是四位的整数，
 在传递过程中是加密的，加密规则如下：每位数字都加上5,
 然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 
 1、获取输入n
 2、定义int[4],把n%10+5的值储存进去
 3、第一位和第四位交换，第二位和第三位交换
 */
package exercise;
import java.util.Scanner;

public class exercise48 {
	public static void main(String[] args)
	{
		System.out.print("请输入要传输的四位数：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//获取该四位数
		int[] array=new int[4];
		
		for(int i=3;i>=0;i--)
		{
			array[i]=n%10+5;//给数据加密，存进数组
			n=n/10;
		}
		
		int temp1=array[0];
		array[0]=array[3];//第一位和第四位交换
		array[3]=temp1;
		
		int temp2=array[1];
		array[1]=array[2];//第二位和第三位交换
		array[2]=temp2;
		
		System.out.println("加密后的四位数为："+(1000*array[0]+100*array[1]+10*array[2]+array[3]));
		in.close();
	}

}
