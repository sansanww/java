/*
 ��Ŀ��һ��5λ�����ж����ǲ��ǻ�������
 ��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 
 ������
 1����������������������
 2���жϸ�λ����λ��ʮλ��ǧλ�Ƿ����
 */
package exercise;
import java.util.Scanner;

public class exercise25 {
	public static void main(String[] args)
	{
		System.out.print("������һ��5λ����������");
		Scanner in=new Scanner(System.in);//�����û�����
		int input=in.nextInt();
		int n=input;//��ȡ������
		int[] number=new int[5];//�������鴢������
		
		for(int i=0;i<5;i++)//����������������
		{
			number[i]=n%10;
			n=n/10;
		}
		
		if(number[0]==number[4] && number[1]==number[3])//�ж��Ƿ������
			System.out.println(input+"�ǻ�����");
		else
			System.out.println(input+"���ǻ�����");
		
		in.close();
	}

}

