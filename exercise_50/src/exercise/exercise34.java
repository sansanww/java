/*
 ����3����a,b,c������С˳�����
 
 ������
 1����ȡ���������������
 2������Ԫ�����򣺰����Ԫ�ط��������������Ƚ�
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise34 {
	public static void main(String[] args)
	{
		System.out.print("�����������������ÿո������");
		Scanner in=new Scanner(System.in);
		int[] array=new int[3]; 
		
		for(int i=0;i<3;i++)//���û���������������
		{
			array[i]=in.nextInt();
		}
		
		
		
		for(int j=0;j<2;j++)
		{
			for(int k=j+1;k<3;k++)
			{
				if(array[j]>array[k])
				{
					int temp=array[j];
					array[j]=array[k];
					array[k]=temp;
				}
			}
		}
		System.out.print("��������");
		for(int i=0;i<3;i++)
		{
			System.out.print(array[i]+" ");//��ӡ��������
		}
		in.close();
	}
}
