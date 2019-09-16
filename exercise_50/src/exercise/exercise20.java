/*
 ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13... ���������е�ǰ20��֮�͡�
 
 ������
 1���۲���Ӻͷ�ĸ�����Ӻͷ�ĸ��ÿһ���ǰ������֮�ͣ���n1/m1,n2/m2,(n1+n2)/(m1+m2)
 2�������ݹ麯��������n�ķ���ֵ���ڲ���n-1�Ͳ���n-2����ֵ֮��
 3������forѭ�������ú������ǰ20��֮��
 */
package exercise;

public class exercise20 {
	public static void main(String[] args)
	{
		double sum=0;
		for(int n=1;n<=20;n++)
		{
			sum+=molecular(n)+denominator(n);
		}
		System.out.println("ǰ20��ĺ�Ϊ��"+sum);
	}
	
	public static int molecular(int n)//���庯���������
	{
		if(n==1)
			return 2;
		if(n==2)
			return 3;
		return molecular(n-1)+molecular(n-2);//�ݹ飬��n-1��n-2��ĺ���Ϊ����ֵ
	}
	
	public static int denominator(int n)//���庯�������ĸ
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return denominator(n-1)+denominator(n-2);//�ݹ飬��n-1��n-2��ĺ���Ϊ����ֵ
	}
}
