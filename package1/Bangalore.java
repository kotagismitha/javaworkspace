package package1;
abstract class Delhi
{
abstract void delhi_roads(); //abstract method
abstract void delhi_hospitals();	//abstract method2
}
abstract public class Bangalore extends Delhi {
	void delhi_roads()
	{
		System.out.print("my actual logic 1 is here");	
	}
	void delhi_hospitals()
	{
		System.out.print("my actual logic 2 is here");
	}
	public static void main(String[] args)
	
	{
		
	}

}
