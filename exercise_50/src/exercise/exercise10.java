/*
	��Ŀ��һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
	�����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
	������
	1��ÿ����ص���ĸ߶ȣ�
		1��h/2
		2:h/4
		...
		n:h/Math.pow(2,n)
	2����һ����ؾ�����·��Ϊh
		��n��(n>1)��ؾ�����·�̣�h+2*(h/2+h/4+...+h/Math.pow(2,n-1))
	3������һ��forѭ���������n����ؾ�����·��
		
 */

package exercise;
import java.util.Scanner;

public class exercise10 {
	public static void main(String[] args)
	{
		System.out.print("������h��n��");
		Scanner in=new Scanner(System.in);
		double h=in.nextDouble();
		int n=in.nextInt();
		
		double bounce=h/Math.pow(2,n);//��n�ε���ĸ߶�
		double journey=h;//·�̳�ʼ��Ϊh
		if(n!=1)//n>1��ʱ���ٽ���forѭ��,�����n����ؾ�����·��
		{
			for(int i=1;i<n;i++)//
			{
				journey+=2*h/Math.pow(2,n-1);
			}
		}
		
		System.out.println("��"+n+"����أ�������"+String.format("%.2f",journey)+"��");
		System.out.println("��"+n+"�η�������"+String.format("%.2f", bounce)+"�׸�");
		
		in.close();
	}

}
