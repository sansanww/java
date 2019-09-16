/*
 ��Ŀ�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ���������������
 ������ѧ���ţ����������ſγɼ����������ƽ���ɼ���
 ��ԭ�е����ݺͼ������ƽ����������ڴ����ļ�"stud"�С�
 */
package exercise;
import java.util.Scanner;
import java.io.*;

class student{//����student�࣬������
	String name;
	String ID;
	double grade1;
	double grade2;
	double grade3;
	double average;
	
	student(String name,String ID)
	{
		this.name=name;
		this.ID=ID;
	}
	public void setGrade(double grade1,double grade2,double grade3)//�ѷ���������飬����ƽ����
	{
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.average=(grade1+grade2+grade3)/3;
	}
}

public class exercise50 {
	public static void main(String[] args)
	{
		//��ȡѧ������
		System.out.print("������ѧ��������");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//��ȡѧ������
		student[] stud=null;//��������洢ѧ������
		
		try {
			stud=input(n);//����input��������ѧ������������
		}
		catch(IOException e) {
			System.out.println("����ȷ���룡");
		}
			
		//����output�������ѧ������
		try{
			output(stud);
		}
		catch(IOException e){
			System.out.println("�����ļ������쳣��"+e);
		}
		in.close();
	}
	
	public static student[] input(int n) throws IOException//�洢ѧ������
	{
		//��������洢ѧ������
		student[] stud=new student[n];
		//ͨ��forѭ����ȡn��ѧ������Ϣ
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�û����뻺����
		try {
			for(int i=0;i<n;i++)
			{
				
				System.out.print("�������"+(i+1)+"��ѧ�����֣�");//����
				String name=br.readLine();
				
				System.out.print("�������"+(i+1)+"��ѧ��ѧ�ţ�");//ѧ��
				String ID=br.readLine();
				
				stud[i]=new student(name,ID);//���´�����ѧ������������
				//���ѧ���������ųɼ�
				double[] grade=new double[3];//�������飬�洢�û�����ķ���
				for(int j=0;j<3;j++)
				{
					System.out.print("�������"+(i+1)+"��ѧ����"+(j+1)+"�ſγɼ���");
					grade[j]=Double.parseDouble(br.readLine());
				}
							
				stud[i].setGrade(grade[0],grade[1],grade[2]);//������ѧ������		
			}
		}
		catch(IOException e){
			System.out.println("����ȷ���룡");
		}
		return stud;//���ش���ѧ�����������
	}
	
	public static void output(student[] stud) throws IOException//���ѧ�����ݣ������Ǵ���ѧ�����������
	{
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\java\\exercise\\bin\\exercise\\stud.txt");//�½��ļ���д��
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Name "+"ID "+"grade1 "+"grade2 "+"grade3 "+"average");//����
		bw.newLine();
		for(int i=0;i<stud.length;i++)//�������е�ѧ������д���ļ�
		{
			bw.write(stud[i].name+" ");
			bw.write(stud[i].ID+" ");
			bw.write(stud[i].grade1+" ");
			bw.write(stud[i].grade2+" ");
			bw.write(stud[i].grade3+" ");
			bw.newLine();
		}
		bw.close();
	}
}

