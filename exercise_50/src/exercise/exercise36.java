/*
 ��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����
 
 ������
 1���½�������ͬ������
 2������forѭ������ԭ����������������
 */
package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise36 {
	public static void main(String[] args)
	{
		System.out.print("��������������Ŀn��");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//���鳤��
		
		System.out.print("�������ƶ���λ������m��m<n����");
		Scanner in2=new Scanner(System.in);
		int m=in2.nextInt();//��ȡm
		
		int[] array1=new int[n]; //��������洢����
		int[] array2=new int[n]; //��������洢λ�ñ仯֮���ֵ
		
		System.out.print("�������������ÿո������");//��������
		Scanner in3=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			array1[i]=in3.nextInt();//�������룬�����鸳ֵ
		}
		System.out.println("���������ֵ��"+Arrays.toString(array1));//��ӡԭ����
		
		for(int i=0;i<m;i++)//��array1���m�������array2
		{
			array2[i]=array1[i+n-m];
		}
		for(int j=m;j<n;j++)//��array1ǰ��n-m�������array2
		{
			array2[j]=array1[j-m];
		}
		
		System.out.println("��������ֵ��"+Arrays.toString(array2));//��ӡ������
	
		in1.close();
		in2.close();
		in3.close();
	}
}
