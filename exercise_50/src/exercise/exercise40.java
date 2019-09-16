/*
 题目：字符串排序。
 
 分析：
 1、数组比较：取出数组最后一个元素，和其余元素比较，把较大元素放在最后
 2、依次往前取出元素，重复上述过程
 3、字符串比较方法：str1.compare(str2)
 */
package exercise;
import java.util.Arrays;

public class exercise40 {
	public static void main(String[] args)
	{
		String[] str= {"aaa","bbb","ccc","ddd","aa","aa1","k"};
		for(int i=str.length-1;i>0;i--)//从最后一个元素，一直取到第二个元素
		{
			for(int j=0;j<i;j++)//把str[i]之前的元素都取出来比较
			{
				if(str[i].compareTo(str[j])<0)//如果别的元素比str[i]大，则交换位置
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("字符串排序："+Arrays.deepToString(str));
	}
}
