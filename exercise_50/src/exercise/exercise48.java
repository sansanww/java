/*
 ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ��������
 �ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,
 Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 
 1����ȡ����n
 2������int[4],��n%10+5��ֵ�����ȥ
 3����һλ�͵���λ�������ڶ�λ�͵���λ����
 */
package exercise;
import java.util.Scanner;

public class exercise48 {
	public static void main(String[] args)
	{
		System.out.print("������Ҫ�������λ����");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//��ȡ����λ��
		int[] array=new int[4];
		
		for(int i=3;i>=0;i--)
		{
			array[i]=n%10+5;//�����ݼ��ܣ��������
			n=n/10;
		}
		
		int temp1=array[0];
		array[0]=array[3];//��һλ�͵���λ����
		array[3]=temp1;
		
		int temp2=array[1];
		array[1]=array[2];//�ڶ�λ�͵���λ����
		array[2]=temp2;
		
		System.out.println("���ܺ����λ��Ϊ��"+(1000*array[0]+100*array[1]+10*array[2]+array[3]));
		in.close();
	}

}
