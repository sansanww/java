/*
 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
 问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。
 问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
 
 分析：
 1、这是一个等差数列，后一项比前一项大2
 2、运用递归的方法求每一项的值
 */
package exercise;

public class exercise23 {
	public static void main(String[] args)
	{
		System.out.println("第5个人的年龄为："+getAge(5));
	}
	public static int getAge(int n)
	{
		if(n==1)
			return 10;
		return 2+getAge(n-1);//运用递归方法，求每一项的值
	}
}
