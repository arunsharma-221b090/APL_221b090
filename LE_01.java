/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    int age;
    String name;
    
    void setage(int age){
        this.age = age;
    }
    
    void setname(String name){
        this.name = name;
    }
    
    int getage(){
        return this.age;
    }
    
    String getname(){
        return this.name;
    }

public static void main(String[] args) {
	Main obj1 = new Main();
	obj1.setage(22);
	obj1.setname("Arun");
	System.out.println(obj1.getname() + " " + obj1.getage());
}
}

