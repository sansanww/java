/*
 ��Ŀ����100֮�ڵ�����
 
 ������
 1������100���ڵ���n
 2���ж����ֱ���1��n/2+1����ȥ��n
 */
package exercise;

public class exercise27 {
public static void main(String[] args)
{
	System.out.print("100���ڵ������У�");
	for(int i=2;i<100;i++)//����100���ڵ���
	{
		boolean flag=true;
		for(int j=2;j<i/2+1;j++)//����1��n/2+1����
		{
			if(i!=2 && i%j==0)//�ж��Ƿ�Ϊ����
				flag=false;
		}
		if(flag)
			System.out.print(i+" ");//��ӡ������
	}
}
}
