/*
 ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
 60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 */
package exercise;
import java.util.Scanner;

public class exercise05 {
	public static void main(String[] args)
	{
		System.out.print("������0-100֮��ķ�����");
		Scanner in = new Scanner(System.in);
		double grade=in.nextDouble();//�趨Ϊdouble���ͣ����۷���������С���㣬�����Խ���
		//���жϷ�����Χ�Ƿ񳬳���Ȼ�������ȼ�
		if(grade<0 || grade>100)
			System.out.println("����������Χ��");
		else if(grade>=90)
			System.out.println("�����ȼ�ΪA");
		else if(grade>=60)
			System.out.println("�����ȼ�ΪB");
		else
			System.out.println("�����ȼ�ΪC");
		
		in.close();
	}

}
