import java.util.Scanner;
 class student
{
int rollno;
String name;
String address;
long mobileno;
}

public class Test
{
public static void main(String[]args)
{
student  s=new student();
	s.rollno=10;
	s.name="Ram";
	s.address="Pune";
	s.mobileno=1122334455l;
System.out.println(s.rollno);
System.out.println(s.name);
System.out.println(s.address);
System.out.println(s.mobileno);
	Scanner sc=new Scanner(System.in);
	s.rollno=sc.nextInt();
	s.name=sc.next();
	s.address=sc.next();
	s.mobileno=sc.nextLong();
System.out.println(s.rollno);
System.out.println(s.name);
System.out.println(s.address);
System.out.println(s.mobileno);
}
}