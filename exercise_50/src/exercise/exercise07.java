/*
 题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
 
 分析：
 1、用nextLine()方法读取输入的一行字符
 2、每次取出其中一个字符，求出跟ASCII编码表对应的值
 3、char字符ASCII码的范围
         （1）数字0到9： 48~57
         （2）字母A到Z：65到90 a到z：97到122
         （3）空格是32
 4、定义一个包含四个元素的数组count，统计每种类型字符出现的个数
 
 */

package exercise;
import java.util.Scanner;

public class exercise07 {
	public static void main(String[] args)
	{
		System.out.print("请输入一行符号：");
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();//从输入中读取一行字符
		countChar(line);//调用函数来统计字符
		in.close();
	}
	public static void countChar(String s)
	{
		char[] arr=s.toCharArray();//把s里的内容赋值给字符型数组
		int[] count=new int[4];
		//运用for循环，依次对arr中字符进行判断,并统计次数，记录在count数组里
		for(int i=0;i<arr.length;i++ )
		{
			if((arr[i]>=65 && arr[i]<=90) || (arr[i]>=97 && arr[i]<=122))
				count[0]+=1;
			else if(arr[i]==32)
				count[1]+=1;
			else if((arr[i]>=48 && arr[i]<=57))
				count[2]+=1;
			else
				count[3]+=1;
		}
		System.out.println("英文字母出现："+count[0]+"次");
		System.out.println("空格出现："+count[1]+"次");
		System.out.println("数字出现："+count[2]+"次");
		System.out.println("其他字符出现："+count[3]+"次");
	}

}
