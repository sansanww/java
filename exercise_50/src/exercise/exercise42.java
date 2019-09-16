/*
 题目：809*??=800*??+9*??+1
 
 分析：
 1、用for循环遍历所有二位数
 2、若满足上式，则输出，不满足，则提示不存在二位数满足这个式子
 */
package exercise;

public class exercise42 {
	public static void main(String[] args)
	{
		boolean flag=false; 
		for(int n=10;n<100;n++)
		{
			if(809*n==(800*n+9*n+1))
			{
				System.out.println("809*"+n+"=800*"+n+"+9*"+n+"+1");
				flag=true;
			}
		}
		if(!flag)
			System.out.println("不存在二位数满足这个式子！");
	}

}
