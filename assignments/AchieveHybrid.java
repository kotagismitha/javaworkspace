/*24.Write a program for hybrid level inheritance with 4 classes,
method to any class,check whether it is acheviable or not?*/
package assignments;
class grandparent extends ParentToAchieveHybrid{
	static void properties(){
		System.out.println("I provide numbers to add");}}
class Parent extends grandparent{
	static void statement(){
	System.out.println("Add two numbers");}
	public static void main(String[] args) {
		declare();	}}
public class AchieveHybrid extends Parent{
	static void statement1(){
	System.out.println("Provide two numbers to add");}
	public static void main(String[] args) {
		statement();
		statement1();}}

