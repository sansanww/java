/*
 ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ����
 ���λ���������͵��ڸ�������
���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���

���������
1.�������е���λ��
2.�ֱ��ÿ�����ֵĸ�ʮ��λȡ����������������

 */
package exercise;

public class exercise03 {
	public static void main(String[] args)
	{
		daffodil();
	}
	
	//���庯��daffodil���������е���λ������ӡ���еġ�ˮ�ɻ�����
	public static void daffodil()
	{
		for(int x=100;x<1000;x++)
		{
			//�ж�ȡ���������Ƿ��ǡ�ˮ�ɻ�����
			if(isdaffodil(x))
				System.out.println(x);
		}
	}
	
	//���庯��isdaffodil���ж�ĳ�����Ƿ��ǡ�ˮ�ɻ�����
	public static boolean isdaffodil(int y)
	{
		int i,j,k;
		int sum;
		boolean flag=false;
		i=(y%10);
		j=((y/10)%10);
		k=(y/100);
		//sum=(int) (Math.pow(i,3)+Math.pow(i,3)+Math.pow(i,3));
		sum=i*i*i+j*j*j+k*k*k;
		
		if(sum==y)
			flag=true;
		return flag;
	}
	

}


