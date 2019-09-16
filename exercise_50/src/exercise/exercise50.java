/*
 题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据
 （包括学生号，姓名，三门课成绩），计算出平均成绩，
 将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
 */
package exercise;
import java.util.Scanner;
import java.io.*;

class student{//定义student类，绑定属性
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
	public void setGrade(double grade1,double grade2,double grade3)//把分数存进数组，并求平均分
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
		//获取学生人数
		System.out.print("请输入学生人数：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//获取学生人数
		student[] stud=null;//创建数组存储学生对象
		
		try {
			stud=input(n);//调用input函数，把学生对象存进数组
		}
		catch(IOException e) {
			System.out.println("请正确输入！");
		}
			
		//调用output函数输出学生数据
		try{
			output(stud);
		}
		catch(IOException e){
			System.out.println("创建文件出现异常："+e);
		}
		in.close();
	}
	
	public static student[] input(int n) throws IOException//存储学生数据
	{
		//创建数组存储学生对象
		student[] stud=new student[n];
		//通过for循环获取n个学生的信息
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//用户输入缓冲区
		try {
			for(int i=0;i<n;i++)
			{
				
				System.out.print("请输入第"+(i+1)+"个学生名字：");//名字
				String name=br.readLine();
				
				System.out.print("请输入第"+(i+1)+"个学生学号：");//学号
				String ID=br.readLine();
				
				stud[i]=new student(name,ID);//把新创建的学生对象存进数组
				//添加学生对象三门成绩
				double[] grade=new double[3];//创建数组，存储用户输入的分数
				for(int j=0;j<3;j++)
				{
					System.out.print("请输入第"+(i+1)+"个学生第"+(j+1)+"门课成绩：");
					grade[j]=Double.parseDouble(br.readLine());
				}
							
				stud[i].setGrade(grade[0],grade[1],grade[2]);//分数绑定学生对象		
			}
		}
		catch(IOException e){
			System.out.println("请正确输入！");
		}
		return stud;//返回存有学生对象的数组
	}
	
	public static void output(student[] stud) throws IOException//输出学生数据，参数是存有学生对象的数组
	{
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\java\\exercise\\bin\\exercise\\stud.txt");//新建文件，写入
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Name "+"ID "+"grade1 "+"grade2 "+"grade3 "+"average");//首行
		bw.newLine();
		for(int i=0;i<stud.length;i++)//把数组中的学生对象写入文件
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

