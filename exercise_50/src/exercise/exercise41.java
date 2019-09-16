/*
 题目：海滩上有一堆桃子，五只猴子来分。
 第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，
 拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，
 它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，
 问海滩上原来最少有多少个桃子？
 
 分析：
 1、尝试给1000以内的整数n
 2、进行五次for循环，如果均满足n%5=1,(n/5)%5=1,则输出该数
 3、定义一个标记以输出数值
 */
package exercise;

public class exercise41 {
	public static void main(String[] args)
	{
		for(int i=1;i<10000;i++)//取一千以内的整数
		{
			boolean flag=true;//标记
			int n=i;//把i的值赋给n
			
			for(int j=0;j<5;j++)//5次for循环判断
			{
				if(n%5!=1)
				{
					flag=false;//如何不满足n%5==1，标记改为false
					break;
				}
				n=4*n/5;//留给下一只猴子的桃子数
			}
			if(flag)
				System.out.println(i);
		}
	}

}
