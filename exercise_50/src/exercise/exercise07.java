/*
 ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ���Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 
 ������
 1����nextLine()������ȡ�����һ���ַ�
 2��ÿ��ȡ������һ���ַ��������ASCII������Ӧ��ֵ
 3��char�ַ�ASCII��ķ�Χ
         ��1������0��9�� 48~57
         ��2����ĸA��Z��65��90 a��z��97��122
         ��3���ո���32
 4������һ�������ĸ�Ԫ�ص�����count��ͳ��ÿ�������ַ����ֵĸ���
 
 */

package exercise;
import java.util.Scanner;

public class exercise07 {
	public static void main(String[] args)
	{
		System.out.print("������һ�з��ţ�");
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();//�������ж�ȡһ���ַ�
		countChar(line);//���ú�����ͳ���ַ�
		in.close();
	}
	public static void countChar(String s)
	{
		char[] arr=s.toCharArray();//��s������ݸ�ֵ���ַ�������
		int[] count=new int[4];
		//����forѭ�������ζ�arr���ַ������ж�,��ͳ�ƴ�������¼��count������
		for(int i=0;i<arr.length;i++ )
		{
			if((arr[i]>=65 && arr[i]<=90) || (arr[i]>=97 && arr[i]<=122))
				count[0]+=1;
			else if(arr[i]==32)
				count[1]+=1;
			else if((arr[i]>=48 && arr[i]<=57))
				count[2]+=1;
			else
				count[3]+=1;
		}
		System.out.println("Ӣ����ĸ���֣�"+count[0]+"��");
		System.out.println("�ո���֣�"+count[1]+"��");
		System.out.println("���ֳ��֣�"+count[2]+"��");
		System.out.println("�����ַ����֣�"+count[3]+"��");
	}

}
