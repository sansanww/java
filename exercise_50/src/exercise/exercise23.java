/*
 ��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ
 �ʵ�4������������˵�ȵ�3���˴�2�ꡣ�ʵ������ˣ���˵�ȵ�2�˴����ꡣ
 �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶��
 
 ������
 1������һ���Ȳ����У���һ���ǰһ���2
 2�����õݹ�ķ�����ÿһ���ֵ
 */
package exercise;

public class exercise23 {
	public static void main(String[] args)
	{
		System.out.println("��5���˵�����Ϊ��"+getAge(5));
	}
	public static int getAge(int n)
	{
		if(n==1)
			return 10;
		return 2+getAge(n-1);//���õݹ鷽������ÿһ���ֵ
	}
}
