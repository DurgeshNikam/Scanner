import java.util.Scanner;
public class Student
{
int rollno;
String name;
String address;
long mobileno;

public Student(int rollno, String name, String address, long mobileno)
{
this.rollno=rollno;
this.name=name;
this.address=address;
this.mobileno=mobileno;
}
public static void main(String[]args)
{
	Student s=new Student(10,"ABC","Pune",887799l);
System.out.println(s.rollno);
System.out.println(s.name);
System.out.println(s.address);
System.out.println(s.mobileno);
	Scanner sc=new Scanner(System.in);
	Student stu=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextLong());

System.out.println(stu.rollno);
System.out.println(stu.name);
System.out.println(stu.address);
System.out.println(stu.mobileno);
}
}