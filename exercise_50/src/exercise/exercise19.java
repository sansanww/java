/*
 ��Ŀ����ӡ������ͼ�������Σ�
    *
   ***
  *****
 *******
  *****
   ***
    *
  ������
  1������ÿ�е�*�����ֱ�Ϊ1��3��5��7��5��3��1
  2��ǰ���п�����Ϊһ�飬��������Ϊһ��
  3��ÿ����ǰ��ո�ֱ�Ϊ3��2��1��0��1��2��3
 */

package exercise;

public class exercise19 {
	public static void main(String[] args)
	{
		//���ǰ����
		for(int n=0;n<4;n++)
		{
			//�����߿ո�
			for(int i=0;i<3-n;i++)
			{
				System.out.print(" ");
			}
			//���*��
			for(int j=0;j<2*n+1;j++)
			{
				System.out.print("*");
			}
			//����ұ߿ո�
			for(int k=0;k<3-n;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//���������
		for(int n=0;n<3;n++)
		{
			//�����߿ո�
			for(int i=0;i<=n;i++)
			{
				System.out.print(" ");
			}
			//���*��
			for(int j=0;j<5-2*n;j++)
			{
				System.out.print("*");
			}
			//����ұ߿ո�
			for(int k=0;k<=n;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
