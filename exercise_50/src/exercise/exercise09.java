/*
 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 例如6=1＋2＋3.编程找出1000以内的所有完数。
 
 分析：
 1.用for进行两层循环，外循环遍历1000以内的数i，内循环分解因数
 2、通过i%j==0,求出i的所有因数
 3、把因数的和 与该数作比较
 */

package exercise;

public class exercise09 {
	public static void main(String[] args){
		System.out.println("1000以内的“完数”有：");
		for(int i=1;i<1000;i++)//遍历1000以内的数
		{
			int sum=0;//初始化因数的和
			for(int j=1;j<i/2+1;j++)//分解因数
			{
				if(i%j==0)
					sum+=j;
			}
			if(sum==i)//判断并输出“完数”
				System.out.print(i+" ");
		}
	}
}



