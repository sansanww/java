/*
 ��Ŀ����һ���������������
 */
package exercise;
import java.util.Arrays;

public class exercise31 {
	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("ԭ���飺 "+Arrays.toString(array));//ԭ����
		
		System.out.print("�������飺[");
		
		for(int i=array.length-1;i>=0;i--)//�����һ��Ԫ�ر�������һ��Ԫ��
		{
			if(i==0)
			{
				System.out.print(array[i]+"]");//��ӡ��ԭ����ĵ�һ��Ԫ�أ����ö���
			}
			else 
			{
				System.out.print(array[i]+", ");
			}
		}
	}

}
