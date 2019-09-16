/*
 题目：取一个整数a从右端开始的4～7位。
 
 分析：
 1、获取整数a
 2、把整数转成字符串，再转换成字符数组
 3、输出从右端开始的4～7位
 */
package exercise;
import java.util.Scanner;
public class exercise32 {
	public static void main(String[] args)
	{
		System.out.print("请输入不少于7位的整数：");
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();//获取整数a
		char[] array=(Long.toString(a)).toCharArray();//把整数转成字符串，再转换成字符数组
		int n=array.length;
		
		System.out.print("整数"+a+"从右端开始的4～7位为：");
		System.out.print(array[n-4]+" "+array[n-5]+" "+array[n-6]+" "+array[n-7]);
		in.close();
	}

}
