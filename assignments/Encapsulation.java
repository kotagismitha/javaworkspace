package assignments;
class Google_Auth{
	private String key = "adfu4nf43r01239hnfew";
public void setKey(String key){
	this.key=key;}
public String getKey(){
	return key;}
public String getUsername() {
	return username;}
public void setUsername(String username){
	this.username = username;}
private String username="Smithabvb@gmail.com";}
public class Encapsulation {
public static void main(String args[]){
	Google_Auth g1= new Google_Auth();
	g1.setKey("09QWEwfe4820481332432");
	System.out.println(g1.getKey());
	g1.setUsername("Shivakumarfk@gmail.com");
	System.out.println(g1.getUsername());}}

