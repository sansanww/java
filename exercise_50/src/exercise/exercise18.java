/*
 ��Ŀ������ƹ����ӽ��б������������ˡ�
 �׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
 �ѳ�ǩ���������������������Ա����������������
 a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�����
 
 ������
 1����������forѭ��������
 2��������֪�������ж����
 */

package exercise;

public class exercise18 {
	public static void main(String[] args)
	{
		String a = null, b = null, c = null;//�׶ӳ�Ա
        String[] racer = {"x", "y", "z"};//�Ҷӳ�Ա
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        a = racer[i];
                        b = racer[j];
                        c = racer[k];
                        if (!a.equals("x") && !c.equals("z") && !c.equals("x")) {                      
                                System.out.println("a�Ķ����ǣ�" + racer[i] + "��b�Ķ����ǣ�" + racer[j] + "��c�Ķ����ǣ�" + racer[k]);
                        }
                    }
                }
            }
        }
	}

}
