//题目：判断101-200之间有多少个素数，并输出所有素数。

package exercise;

public class exercise02 {
	public static void main(String[] args)
	{
		Prime();
	}
	
	public static void Prime()
	{
		int count=0;
		
		//遍历101-200之间的数字，每次取出一个
		for(int x=101;x<200;x++)
		{
			//判断取出的数字是否是素数,只需要判断到x的平方根部分就行了
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
		
		System.out.println("101-200之间总共有"+count+"个素数");
	}
}
