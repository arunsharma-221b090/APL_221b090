/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Test
{
	public static void main(String[] args) {
		Offering offer1=new Coffee();
		offer1=new Rum(offer1);
		offer1=new Gin(offer1);
		System.out.println(offer1.getName()+": ₹ "+offer1.getPrice());
		
		Offering offer2=new Coffee();
		offer2=new Rum(offer2);
		offer2=new Gin(offer2);
		System.out.println(offer2.getName()+": ₹ "+offer2.getPrice());
	}
}