/*34.Write a program using with abstract class-Abstract class 
(2 abstract methods,2 concrete methods) and class have 2 concrete methods*/
package assignments;
abstract class Shares {
abstract void PayThroughNetBanking();
abstract void PaythoughUPI();
public static void bookFlight(){
	System.out.println("Details of Flights available");}
public static void booktrain(){
	System.out.println("Tatkal seats available chart");}}
abstract class AbstractConcept extends Shares {	
void PayThroughNetBanking() {
		System.out.println("Banking details of the user");}
void PaythoughUPI() {	
		System.out.println("UPI code");}
	public static void FlightsBookedToday(){
		System.out.println("Total is 5");}
	public static void numberoftatkalSeatsremaining(){
		System.out.println("Total is 24");}
	public static void main(String[] args) {		
bookFlight();booktrain();numberoftatkalSeatsremaining();FlightsBookedToday();}}

