/*
 ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
 
 ������
 1�����Ը�����Χ1�����û���ҵ���������Χ
 2���ȸ���i����100���жϿ����Ľ����1+100�Ƿ����
 3������168�Ĳ���ͬ��
 
 */
package exercise;

public class exercise13 {
	public static void main(String[] args)
	{
		for(int i=1;i<10000;i++)
		{
			int num1=(int)Math.sqrt(i+100);
			int num2=(int)Math.sqrt(i+168);
			if(i+100==num1*num1 && i+168==num2*num2)
				System.out.println("��ȫƽ������"+i);
		}
	}

}
