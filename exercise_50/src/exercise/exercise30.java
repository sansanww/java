/*
 ��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
 
 ������
 1�����鳤��n���ɱ䣬�����Ҫ��������Ϊn+1�����������
 2���Ѹ���������������Ԫ�����Ƚϣ��ѽ�С�����������
 */
package exercise;
import java.util.Scanner;
import java.util.Arrays;

public class exercise30 {
	public static void main(String[] args)
	{
		int[] array1= {1,2,3,4,5,6,8,9};//ԭ����
		int[] array2=new int[array1.length+1];//��������Ϊarray1.length+1�����鱣������
		
		System.out.print("������һ����:");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();//��ȡ�û��������
		
		a:
		for(int i=0;i<array1.length;i++)//���Ϊa��forѭ��������array1
		{
			
			
				
			if(array1[i]>number) {  //���number��С�����Ƚ���array2
				array2[i]=number;
				//����array2[i+1]=array1[i],�Ǳ����1��ԭ����forѭ���޷���������
				//���½�forѭ������array1ʣ�µ�Ԫ�ض��浽array2��ȥ
				for(int j=i;j<array1.length;j++)
				{
					array2[j+1]=array1[j];
				}
				break a;//���Ʊ��Ϊa��ѭ���������洢
			}
			else 
			{
				if(array1[array1.length-1]<=number) {
					//number��array1���һ��Ԫ�ػ������number�浽array2��ĩβ
					array2[array1.length]=number;
				}
				array2[i]=array1[i];
			}
		}
		System.out.println("ԭ���飺"+Arrays.toString(array1));
		System.out.print("�����飺"+Arrays.toString(array2));
		/*
		for(int y:array2)
		{
			System.out.print(y+" ");//��ӡ������
		}
		*/
	}

}
