/*
 题目：计算字符串中子串出现的次数
 
 分析：
 1、定义函数，参数分别为字符串和子串，返回值为字串出现次数
 2、把字符串和字串都变成字符数组，嵌套两层for循环
 3、第一层循环取字符串中字符，第二层取子串中字符
 */
package exercise;
import java.util.Scanner;

public class exercise49 {
	
		public static void main(String[] args)
		{
			System.out.print("请输入字符串：");
			Scanner in1=new Scanner(System.in);
			String str=in1.nextLine();//字符串
			
			System.out.print("请输入子串：");
			Scanner in2=new Scanner(System.in);
			String substr=in2.nextLine();//子串
			
			//调用fun函数统计次数
			System.out.println("字符串中子串出现的次数:"+fun(str,substr));
			
			in1.close();
			in2.close();
		}
		
		//定义函数，统计字符串中子串出现的次数
		public static int fun(String str,String substr)
		{
			int count=0;
			char[] str_array=str.toCharArray();//字符串变成字符数组
			char[] substr_array=substr.toCharArray();//把字串变成字符数组
			
			//遍历字符串的字符数组，最后substr_array.length-1个元素不需要比较
			for(int i=0;i<(str_array.length-substr_array.length+1);i++)
			{
				boolean flag=true;//标记
				for(int j=0;j<substr_array.length;j++)//遍历子串的字符数组
				{
					if(str_array[i+j]!=substr_array[j])//比较
						flag=false;//如果有一个字符不相等，就把flag改为false
				}
				if(flag)//flag为true，说明字符串中子串与参数的子串相等
					count++;
			}
			return count;//返回子串出现次数
		}
	}
	
	