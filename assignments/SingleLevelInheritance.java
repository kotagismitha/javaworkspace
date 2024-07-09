//19.Single level inheritance
package assignments;
class Ancestors{
static void owned(){
		System.out.println("I have a single child");}
	static void owned1(){
System.out.println("This is a method defined in the base class also called as a parent class");}}
public class SingleLevelInheritance extends Ancestors{
static void features(){
	System.out.println("I inherit features of my father");}
static void features2(){
	System.out.println("Me and my father's bank balance are the same");}
public static void main(String[] args){
	features();
	features2();
	owned();
	owned1();	}}
