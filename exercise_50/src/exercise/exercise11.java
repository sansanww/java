/*
��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
������
	1����������forѭ�����ֱ����ʮ��λ�����ж����
	2������һ������������count����������
 */

package exercise;

public class exercise11 {
	public static void main(String[] args)
	{
		int count=0;
		for(int units=1;units<5;units++)
		{
			for(int ten=1;ten<5;ten++)
			{
				for(int hundred=1;hundred<5;hundred++)
				{
					if(units!=ten && units!=hundred && ten!=hundred)
					{
						count++;
						System.out.println(hundred*100+ten*10+units);
					}
				}
			}
		}
		System.out.println("����"+count+"����");
		
	}
}
