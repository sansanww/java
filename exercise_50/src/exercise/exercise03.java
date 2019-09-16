/*
 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 其各位数字立方和等于该数本身。
例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。

程序分析：
1.遍历所有的三位数
2.分别把每个数字的个十百位取出来，计算立方和

 */
package exercise;

public class exercise03 {
	public static void main(String[] args)
	{
		daffodil();
	}
	
	//定义函数daffodil，遍历所有的三位数，打印所有的“水仙花数”
	public static void daffodil()
	{
		for(int x=100;x<1000;x++)
		{
			//判断取出的数字是否是“水仙花数”
			if(isdaffodil(x))
				System.out.println(x);
		}
	}
	
	//定义函数isdaffodil，判断某个数是否是“水仙花数”
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


