/*
��Ŀ����ӡ����������Σ�Ҫ���ӡ��10������ͼ��  1.���������    
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
������

������
1��ÿһ�е���λ����������1��ÿ��Ԫ�ظ�����������ͬ
2������β�������������������ǰһ��ͬ��Ԫ���Լ�ͬ��Ԫ��ǰһ��Ԫ��֮��
3���ݹ飺��������ÿ�е����飬����������
 */
package exercise;

public class exercise33 {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)//��ӡǰʮ��
		{
			int[] array=fun(i);
			for(int j=0;j<array.length;j++)//��ӡ��i�е�����
			{
				System.out.print(array[j]+" ");
			}
			System.out.println();//����
		}
	}
	
	public static int[] fun(int n)//���õݹ麯�������ص�n�е�����
	{
		int[] array=new int[n];//��������
		array[0]=1;//��һ��Ԫ��Ϊ1
		array[n-1]=1;//���һ��Ԫ��Ϊ1
		for(int i=1;i<array.length-1;i++)//ȥ���׺�βԪ��
		{
			array[i]=fun(n-1)[i-1]+fun(n-1)[i];//�ݹ�
		}
		return array;//��������
	}
}
