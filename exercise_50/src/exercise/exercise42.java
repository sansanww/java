/*
 ��Ŀ��809*??=800*??+9*??+1
 
 ������
 1����forѭ���������ж�λ��
 2����������ʽ��������������㣬����ʾ�����ڶ�λ���������ʽ��
 */
package exercise;

public class exercise42 {
	public static void main(String[] args)
	{
		boolean flag=false; 
		for(int n=10;n<100;n++)
		{
			if(809*n==(800*n+9*n+1))
			{
				System.out.println("809*"+n+"=800*"+n+"+9*"+n+"+1");
				flag=true;
			}
		}
		if(!flag)
			System.out.println("�����ڶ�λ���������ʽ�ӣ�");
	}

}
