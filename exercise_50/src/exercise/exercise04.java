/*
 ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��

�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�

1������������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�

2�����n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ����

3�����n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����

 */

package exercise;
import java.util.Scanner;

public class exercise04 {
	public static void main(String[] args)
	{
		System.out.print("������Ҫ�ֽ�����������������");
		Scanner in=new Scanner(System.in);
		decompositionFactor(in.nextInt());//���ú������ֽ��û��������
		in.close();
	}
	
	public static void decompositionFactor(int n)//���庯�����ֽ�������
	{
		int k;//��С����
		System.out.print(n+"=");
		for(k=2;k<=n;)//����forѭ��������С��n����
		{
			
			if(n==k)//���n==k�ͽ����ֽ����
			{
				System.out.println(k);
				break;
			}
			else
			{
				//�ж��Ƿ�������������������k++,����������k��¼��������n����k����,��Ϊ�µ�������n
				if(n%k==0)
				{
					n=n/k;
					System.out.print(k+"*");
				}
				else
					k++;
			}
		}
		
	}

}
