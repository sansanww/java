/*
 ��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������
 	������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
 
 ������
 1����ȡ�û������n
 2��n%3,0����2������2�ţ�1����1��
 */
package exercise;
import java.util.Scanner;

public class exercise37 {
	public static void main(String[] args)
	{
		System.out.print("����������n��");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//��ȡ����
		
		if(n%3==0 || n%3==2)
			System.out.println("��������2��");
		else 
			System.out.println("��������1��");
	}

}
