/*
 ��Ŀ����һ��3*3����Խ���Ԫ��֮��
 
 1������3*3����
 2����forѭ���ֱ�ȡ����������ҶԽ��ߵ�Ԫ�أ����
 */
package exercise;

public class exercise29 {
	public static void main(String[] args)
	{
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};//3*3����
		int[] right=new int[3];//�洢�ҶԽ���Ԫ��
		int[] left=new int[3];//�洢��Խ���Ԫ��
		int sum=0;
		
		for(int i=0,j=2;i<3;i++,j--)//ȡ�Խ���Ԫ��
		{
			sum+=matrix[i][i];//ȡ���ҶԽ���Ԫ��
			if(i!=1)
				sum+=matrix[i][j];//ȡ����Խ���Ԫ�أ��ų����м�һ�е��ظ�ֵ
			
		}
		System.out.println("3*3����Խ���Ԫ��֮��Ϊ��"+sum);
	}

}
