/*
 ��Ŀ����1+2!+3!+...+20!�ĺ�
 
 
 ������
 1�����庯�����õݹ鷽����׳�
 2������forѭ��������ʽ�ӵ�ֵ
 */
package exercise;

public class exercise21 {
	public static void main(String[] args)
	{
		int sum=0;
		
		for(int i=1;i<=20;i++)//���
		{
			sum+=factorial(i);
		}
		System.out.println("1+2!+3!+...+20!="+sum);
	}
	public static int factorial(int n)//�ݹ鷽����׳�
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
