/*
 ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
 ����������ʽ�磺2+22+222=246��
 
 ������
 1.��ȡa������
 2.��k+1��ȵ�k���a*(10��k�η�)
 */
package exercise;
import java.util.Scanner;

public class exercise08 {
	public static void main(String[] args)
	{
		//��ȡa��������ֵ
		System.out.print("������a��ֵ��");
		Scanner number=new Scanner(System.in);
		int a=number.nextInt();
		
		System.out.print("����������n��");
		Scanner numberofterms=new Scanner(System.in);
		int n=numberofterms.nextInt();
		
		int sum=0;
		int[] arr=new int[n];//��������Ϊn�����鴢��ÿһ��
		
		arr[0]=a;
		
		//����forѭ������ÿһ��������arr��
		for(int i=1;i<n;i++)
		{
			arr[i]=arr[i-1]+a*(int)Math.pow(10,i);
		}
		
		for(int num:arr)//���,���Ҵ�ӡ���
		{
			sum+=num;
			if(num==arr[n-1]) //���һ�Σ����ô�ӡ��+����
			{
				System.out.print(num);
			}
			else
				System.out.print(num+"+");
			
		}
		System.out.print("="+sum);
		
		number.close();
		numberofterms.close();
	}
}
