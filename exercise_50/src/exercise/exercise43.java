/*
 题目：求0—7所能组成的奇数个数
 
 分析：
 1、个位数为1、3、5、7的数是奇数，占0-7随机组成的数的一半
 2、0-7能组成8的8次方个数（存在0、00、000这样的情况，但不影响奇数个数）
 */
package exercise;

public class exercise43 {
	public static void main(String[] args)
	{
		System.out.println("0—7所能组成"+((int)Math.pow(8, 8)/2)+"个奇数");
	}

}
