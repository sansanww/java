/*
��Ŀ��������������x,y,z���������������С���������

������
1.x��y��z�����Ĵ�С��ϵ��ֻ�����ֿ��ܣ�
	(x<=y && y<=z)��(x<=z && z<=y)
	(y<=x && x<=z)��(y<=z && z<=x)
	(z<=x && x<=y)��(z<=y && y<=x)
2���������ֿ��������жϴ�С
 */
package exercise;
import java.util.Scanner;

public class exercise15 {
	public static void main(String[] args)
	{
		System.out.print("��������Ƚϵ�����������");
		Scanner in=new Scanner(System.in);//��ȡ�û�����
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

