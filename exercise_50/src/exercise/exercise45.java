/*
 ��Ŀ���ж�һ�������ܱ�����9����
 */
package exercise;
import java.util.Scanner;

public class exercise45 {
    public static void main(String[] args) {
        System.out.print("������һ������");
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long n = l;
        scan.close();
        int count = 0;
        while (n > 8) {
            n /= 9;
            count++;
        }
        System.out.println(l + "�ܱ�" + count + "��9������");
    }
}
