/*
 ��Ŀ���ַ�������
 
 ������
 1������Ƚϣ�ȡ���������һ��Ԫ�أ�������Ԫ�رȽϣ��ѽϴ�Ԫ�ط������
 2��������ǰȡ��Ԫ�أ��ظ���������
 3���ַ����ȽϷ�����str1.compare(str2)
 */
package exercise;
import java.util.Arrays;

public class exercise40 {
	public static void main(String[] args)
	{
		String[] str= {"aaa","bbb","ccc","ddd","aa","aa1","k"};
		for(int i=str.length-1;i>0;i--)//�����һ��Ԫ�أ�һֱȡ���ڶ���Ԫ��
		{
			for(int j=0;j<i;j++)//��str[i]֮ǰ��Ԫ�ض�ȡ�����Ƚ�
			{
				if(str[i].compareTo(str[j])<0)//������Ԫ�ر�str[i]���򽻻�λ��
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("�ַ�������"+Arrays.deepToString(str));
	}
}
