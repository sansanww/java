/*
 ��Ŀ����10������������
 
 ������
 1����������ʮ����������
 2���ѵ�10�����ͷֱ�ͺ�������Ƚϣ��ϴ�ķ��ڵ�9��λ��
 3���������ֶ��ظ�����2
 
 */
package exercise;

public class exercise28 {
	public static void main(String[] args)
	{
		int[] number= {2,3,5,1,7,9,4,8,6,11};
		for(int i=number.length-1;i>0;i--)//������ĩβ��һֱȡ���Ǳ�Ϊ1��Ԫ��
		{
			for(int j=i-1;j>=0;j--)
			{
				if(number[j]>number[i]) //���ǰ���Ԫ�ش���number[i],����Ҫ����λ��
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
					
			}
		}
		System.out.print("������Ϊ��");
		for(int k:number)
			System.out.print(k+" ");
	}

}
