/*
 ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 
 ������
 1�������û������������
 2������һ������Ϊ5������
 3������������֣�����λ��ʮλ����λ��ǧλ����λ���δ������
 4���������е���λ������������ж�Ԫ���Ƿ�Ϊ�㣬�����Ϊ�㣬
 	��Ѹ�Ԫ����Ϊ�յ㣬�������һ��Ԫ�ؿ�ʼ�������
 */
package exercise;
import java.util.Scanner;

public class exercise24 {
	public static void main(String[] args)
	{
		System.out.print("������һ��������5λ����������");
		Scanner in=new Scanner(System.in);//�����û�����
		int input=in.nextInt();
		int n=input;//��ȡ������
		int[] number=new int[5];//�������鴢������
		
		for(int i=0;i<5;i++)//����������������
		{
			number[i]=n%10;
			n=n/10;
		}
		
		for(int j=4;j>=0;j--)//����λ��ʼ�����������ж�
		{
			if(number[j]!=0)//������λ��ֵ������������������forѭ��
			{
				System.out.println("���������"+(j+1)+"��");
				System.out.print(input+"��������Ϊ��");
				for(int k=0;k<=j;k++)
					System.out.print(number[k]);
				break;
			}
		}
		
		in.close();
	}

}
