//��Ŀ���ж�101-200֮���ж��ٸ����������������������

package exercise;

public class exercise02 {
	public static void main(String[] args)
	{
		Prime();
	}
	
	public static void Prime()
	{
		int count=0;
		
		//����101-200֮������֣�ÿ��ȡ��һ��
		for(int x=101;x<200;x++)
		{
			//�ж�ȡ���������Ƿ�������,ֻ��Ҫ�жϵ�x��ƽ�������־�����
			boolean b=true;
			for(int y=2;y<Math.sqrt(x);y++)
			{
				if(x%y==0)
				{
					b=false;
					break;
				}
			}
			
			if(b)
			{
					count++;
					System.out.println(x);
			}
		}
		
		System.out.println("101-200֮���ܹ���"+count+"������");
	}
}
