/*
 题目：两个乒乓球队进行比赛，各出三人。
 甲队为a,b,c三人，乙队为x,y,z三人。
 已抽签决定比赛名单。有人向队员打听比赛的名单。
 a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单
 
 分析：
 1、运用三层for循环来操作
 2、利用已知的条件判断输出
 */

package exercise;

public class exercise18 {
	public static void main(String[] args)
	{
		String a = null, b = null, c = null;//甲队成员
        String[] racer = {"x", "y", "z"};//乙队成员
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        a = racer[i];
                        b = racer[j];
                        c = racer[k];
                        if (!a.equals("x") && !c.equals("z") && !c.equals("x")) {                      
                                System.out.println("a的对手是：" + racer[i] + "，b的对手是：" + racer[j] + "，c的对手是：" + racer[k]);
                        }
                    }
                }
            }
        }
	}

}
