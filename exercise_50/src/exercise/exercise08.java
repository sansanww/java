/*
 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 输出结果的形式如：2+22+222=246；
 
 分析：
 1.获取a和项数
 2.第k+1项比第k项大a*(10的k次方)
 */
package exercise;
import java.util.Scanner;

public class exercise08 {
	public static void main(String[] args)
	{
		//获取a和项数的值
		System.out.print("请输入a的值：");
		Scanner number=new Scanner(System.in);
		int a=number.nextInt();
		
		System.out.print("请输入项数n：");
		Scanner numberofterms=new Scanner(System.in);
		int n=numberofterms.nextInt();
		
		int sum=0;
		int[] arr=new int[n];//创建长度为n的数组储存每一项
		
		arr[0]=a;
		
		//运用for循环，把每一项都存进数组arr里
		for(int i=1;i<n;i++)
		{
			arr[i]=arr[i-1]+a*(int)Math.pow(10,i);
		}
		
		for(int num:arr)//求和,并且打印输出
		{
			sum+=num;
			if(num==arr[n-1]) //最后一次，不用打印“+”号
			{
				System.out.print(num);
			}
			else
				System.out.print(num+"+");
			
		}
		System.out.print("="+sum);
		
		number.close();
		numberofterms.close();
	}
}
