/*
题目：输入三个整数x,y,z，请把这三个数由小到大输出。

分析：
1.x、y、z三个的大小关系，只有六种可能：
	(x<=y && y<=z)、(x<=z && z<=y)
	(y<=x && x<=z)、(y<=z && z<=x)
	(z<=x && x<=y)、(z<=y && y<=x)
2、根据六种可能依次判断大小
 */
package exercise;
import java.util.Scanner;

public class exercise15 {
	public static void main(String[] args)
	{
		System.out.print("请输入待比较的三个整数：");
		Scanner in=new Scanner(System.in);//获取用户输入
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		
		if(x<=y && y<=z) {
			System.out.println(x+"<"+y+"<"+z);
		}
		if(x<=z && z<=y) {
			System.out.println(x+"<"+z+"<"+y);		
		}
		if(y<=x && x<=z) {
			System.out.println(y+"<"+x+"<"+z);
		}
		if(y<=z && z<=x) {
			System.out.println(y+"<"+z+"<"+x);
		}
		if(z<=x && x<=y) {
			System.out.println(z+"<"+x+"<"+y);
		}
		if(z<=y && y<=x) {
			System.out.println(z+"<"+y+"<"+x);
		}		
		in.close();
		}
	}

