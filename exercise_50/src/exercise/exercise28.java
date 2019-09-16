/*
 题目：对10个数进行排序
 
 分析：
 1、创建包含十个数的数组
 2、把第10个数和分别和后面的数比较，较大的放在第9个位置
 3、所有数字都重复步骤2
 
 */
package exercise;

public class exercise28 {
	public static void main(String[] args)
	{
		int[] number= {2,3,5,1,7,9,4,8,6,11};
		for(int i=number.length-1;i>0;i--)//从数组末尾，一直取到角标为1的元素
		{
			for(int j=i-1;j>=0;j--)
			{
				if(number[j]>number[i]) //如果前面的元素大于number[i],则需要交换位置
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
					
			}
		}
		System.out.print("排序结果为：");
		for(int k:number)
			System.out.print(k+" ");
	}

}
