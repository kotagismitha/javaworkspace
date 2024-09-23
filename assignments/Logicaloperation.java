package assignments;
import java.util.Scanner;
public class Logicaloperation 
{
public static void main(String[] args) {
int passmarks=35;
Scanner s1= new Scanner(System.in);
System.out.println("Provide the marks and age of the student");
int marks=s1.nextInt();
int age=s1.nextInt();
if (marks>=passmarks && age>=18)
{
	System.out.println("Student has passed the exam and is eligible to vote");
}
 System.out.println("Student has to retake the exam");
}
}
