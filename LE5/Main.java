/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Whiskey :");
		Beverage B=new Whiskey();
		B.templateMethod(30);
		System.out.println();
		
		System.out.println("Rum :");
		B=new Rum();
		B.templateMethod(30);
		System.out.println();
		
		System.out.println("Beer :");
		B=new Beer();
		B.templateMethod(100);
		System.out.println();
	}
}
