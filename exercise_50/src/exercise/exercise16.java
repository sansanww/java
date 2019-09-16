/*
 * 题目：输出9*9口诀
 * 分析：定义两层for循环，分别表示两个乘数
 */
package exercise;

public class exercise16 {
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+" ");//输出乘法表
			}
			System.out.println();//换行
		}
	}
}
