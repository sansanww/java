/*
 ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
 1����������Ƿ��ܱ�4�������ж��Ƿ�����
 2�������������飬�ֱ𴢴���ͨ��ݺ������1-12�µ�����
 3�������·ݣ���forѭ��ȡ����ֵ�����
 */
package exercise;
import java.util.Scanner;

public class exercise14 {
	public static void main(String[] args)
	{
		System.out.print("��ֱ�����������:");
		Scanner in=new Scanner(System.in);//��ȡ�û�����
		int year=in.nextInt();
		int month=in.nextInt();
		int day=in.nextInt();	
		int date=day;
		//���������·ݵ�����������
		int[] leap_year=new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//����
		int[] common_year=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//ƽ��
		
		if(year%4==0)
		{
			for(int i=0;i<month-1;i++)//ͳ��month֮ǰ�·������ĺ�
			{
				date+=leap_year[i];
			}
		}
		else
		{
			for(int j=0;j<month-1;j++)
			{
				date+=common_year[j];
			}
		}
		
		System.out.println(month+"��"+day+"����"+year+"��ĵ�"+date+"��");
				
		in.close();
	}

}
