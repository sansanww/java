/*
 ��Ŀ���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
 
 1����ȡ����
 2���ֱ��һ��Ԫ�غ���������Ԫ�رȽϣ����ķŵ�һ��λ�ã����һ��Ԫ��ͬ��
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise35 {
	public static void main(String[] args)
	{
		System.out.print("���������鳤�ȣ�");
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();//���鳤��
		int[] array=new int[n]; //��������
		
		System.out.print("���������飬�ÿո������");//��������
		Scanner in2=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			array[i]=in2.nextInt();//�������룬�����鸳ֵ
		}
		System.out.println("ԭ���飺"+Arrays.toString(array));//��ӡԭ����
		
			for(int i=0;i<n;i++)
			{
				if(array[0]<array[i])//���ķŵ�һ��λ��
				{
					int temp=array[0];
					array[0]=array[i];
					array[i]=temp;
				}
				if(array[n-1]>array[i])//��С�ķ����һ��λ��
				{
					int temp=array[n-1];
					array[n-1]=array[i];
					array[i]=temp;
				}
			}
		System.out.println("��������飺"+Arrays.toString(array));//��ӡ����������
		
		in1.close();
		in2.close();
	}

}
