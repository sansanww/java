/*
 ��Ŀ��һ��ż�����ܱ�ʾΪ��������֮�͡�
 
 1����ȡż��n
 2������forѭ������2��n/2ȡ��ֵm�����mΪ������������ж�n-m�Ƿ�������
 3����m��n-m��Ϊ���������
 */
package exercise;
import java.util.Scanner;

public class exercise44 {
	public static void main(String[] args)
	{
		System.out.print("������һ��ż����");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//��ȡ��ż��
		
		for(int m=2;m<=n/2;m++)//ȡ��ֵm
		{
			if(isPrimeNumber(m) && isPrimeNumber(n-m))//m��n-m��������
				System.out.println(m+"+"+(n-m)+"="+n);
		}
		in.close();
	}
	
	public static boolean isPrimeNumber(int n)//���庯�����ж�n�Ƿ�����
	{
		if(n<2)//С��2������������
			return false;
		boolean flag=true;//���
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=false;//����������n��������
		}
		return flag;
	}

}
