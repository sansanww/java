/*
 ��Ŀ�����õݹ鷽����5!��
 */
package exercise;

public class exercise22 {
	public static void main(String[] args)
	{
		System.out.println("5�Ľ׳�Ϊ��"+factorial(5));
	}
	public static int factorial(int n)//�ݹ鷽����׳�
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
