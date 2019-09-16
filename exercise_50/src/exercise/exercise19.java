/*
 题目：打印出如下图案（菱形）
    *
   ***
  *****
 *******
  *****
   ***
    *
  分析：
  1、上述每行的*数量分别为1、3、5、7、5、3、1
  2、前四行可以视为一组，后三行视为一组
  3、每行最前面空格分别为3、2、1、0、1、2、3
 */

package exercise;

public class exercise19 {
	public static void main(String[] args)
	{
		//输出前四行
		for(int n=0;n<4;n++)
		{
			//输出左边空格
			for(int i=0;i<3-n;i++)
			{
				System.out.print(" ");
			}
			//输出*号
			for(int j=0;j<2*n+1;j++)
			{
				System.out.print("*");
			}
			//输出右边空格
			for(int k=0;k<3-n;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//输出后三行
		for(int n=0;n<3;n++)
		{
			//输出左边空格
			for(int i=0;i<=n;i++)
			{
				System.out.print(" ");
			}
			//输出*号
			for(int j=0;j<5-2*n;j++)
			{
				System.out.print("*");
			}
			//输出右边空格
			for(int k=0;k<=n;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
