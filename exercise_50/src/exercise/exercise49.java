/*
 ��Ŀ�������ַ������Ӵ����ֵĴ���
 
 ������
 1�����庯���������ֱ�Ϊ�ַ������Ӵ�������ֵΪ�ִ����ִ���
 2�����ַ������ִ�������ַ����飬Ƕ������forѭ��
 3����һ��ѭ��ȡ�ַ������ַ����ڶ���ȡ�Ӵ����ַ�
 */
package exercise;
import java.util.Scanner;

public class exercise49 {
	
		public static void main(String[] args)
		{
			System.out.print("�������ַ�����");
			Scanner in1=new Scanner(System.in);
			String str=in1.nextLine();//�ַ���
			
			System.out.print("�������Ӵ���");
			Scanner in2=new Scanner(System.in);
			String substr=in2.nextLine();//�Ӵ�
			
			//����fun����ͳ�ƴ���
			System.out.println("�ַ������Ӵ����ֵĴ���:"+fun(str,substr));
			
			in1.close();
			in2.close();
		}
		
		//���庯����ͳ���ַ������Ӵ����ֵĴ���
		public static int fun(String str,String substr)
		{
			int count=0;
			char[] str_array=str.toCharArray();//�ַ�������ַ�����
			char[] substr_array=substr.toCharArray();//���ִ�����ַ�����
			
			//�����ַ������ַ����飬���substr_array.length-1��Ԫ�ز���Ҫ�Ƚ�
			for(int i=0;i<(str_array.length-substr_array.length+1);i++)
			{
				boolean flag=true;//���
				for(int j=0;j<substr_array.length;j++)//�����Ӵ����ַ�����
				{
					if(str_array[i+j]!=substr_array[j])//�Ƚ�
						flag=false;//�����һ���ַ�����ȣ��Ͱ�flag��Ϊfalse
				}
				if(flag)//flagΪtrue��˵���ַ������Ӵ���������Ӵ����
					count++;
			}
			return count;//�����Ӵ����ִ���
		}
	}
	
	