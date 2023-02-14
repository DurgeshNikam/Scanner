import java.util.Scanner;
public class student
{
int rollno;
String name;
public student(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
}
public static void main(String[]args)
{
	student s=new student(10,"ABC");
System.out.println("cont="+s.rollno);	//10
System.out.println("const="+s.name);	//abc
	Scanner sc=new Scanner(System.in);
	student stu=new student(sc.nextInt(),sc.next());

System.out.println("rollno="+stu.rollno);
System.out.println("name="+stu.name);
	

}
}