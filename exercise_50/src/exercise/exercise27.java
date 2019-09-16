/*
 题目：求100之内的素数
 
 分析：
 1、遍历100以内的数n
 2、判定：分别用1至n/2+1的数去除n
 */
package exercise;

public class exercise27 {
public static void main(String[] args)
{
	System.out.print("100以内的素数有：");
	for(int i=2;i<100;i++)//遍历100以内的数
	{
		boolean flag=true;
		for(int j=2;j<i/2+1;j++)//遍历1至n/2+1的数
		{
			if(i!=2 && i%j==0)//判定是否为素数
				flag=false;
		}
		if(flag)
			System.out.print(i+" ");//打印出素数
	}
}
}
