/*
 题目：企业发放的奖金根据利润提成。
 利润(I)低于或等于10万元时，奖金可提10%；
 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 20万到40万之间时，高于20万元的部分，可提成5%；
 40万到60万之间时高于40万元的部分，可提成3%；
 60万到100万之间时，高于60万元的部分，可提成1.5%，
 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 
 分析：
 1、运用if...else...语句，判断利润范围，再根据条件计算奖金总数
 2、
 

 */
package exercise;
import java.util.Scanner;

public class exercise12 {
	public static void main(String[] args)
	{
		System.out.print("请输入利润金额：");
		Scanner in=new Scanner(System.in);
		double profits=in.nextDouble();//初始化利润
		double bonus;//奖金
		
		if(profits<=10)
			bonus=profits*0.1;
		
		else if(profits<=20)
			bonus=10*0.1+(profits-10)*0.075;
		else if(profits<=40)
			bonus=10*0.1+10*0.075+(profits-20)*0.05;
		else if(profits<=60)
			bonus=10*0.1+10*0.075+20*0.05+(profits-40)*0.03;
		else if(profits<=100)
			bonus=10*0.1+10*0.075+20*0.05+20*0.03+(profits-60)*0.015;
		else 
			bonus=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(profits-100)*0.01;
		
		System.out.print("应发奖金为："+bonus);
		in.close();
	}

}
