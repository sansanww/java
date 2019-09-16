/*
 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：

1、如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。

2、如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。

3、如果n不能被k整除，则用k+1作为k的值,重复执行第一步。

 */

package exercise;
import java.util.Scanner;

public class exercise04 {
	public static void main(String[] args)
	{
		System.out.print("请输入要分解质因数的正整数：");
		Scanner in=new Scanner(System.in);
		decompositionFactor(in.nextInt());//调用函数，分解用户输入的数
		in.close();
	}
	
	public static void decompositionFactor(int n)//定义函数来分解质因数
	{
		int k;//最小因数
		System.out.print(n+"=");
		for(k=2;k<=n;)//运用for循环，遍历小于n的数
		{
			
			if(n==k)//如果n==k就结束分解过程
			{
				System.out.println(k);
				break;
			}
			else
			{
				//判断是否能整除，不能整除，k++,能整除，把k记录下来，用n除以k的商,作为新的正整数n
				if(n%k==0)
				{
					n=n/k;
					System.out.print(k+"*");
				}
				else
					k++;
			}
		}
		
	}

}
