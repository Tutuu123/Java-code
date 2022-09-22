 package lab3;


public class GrandMother
 {
	

void relation1()

{

System.out.println("one daughter");

}

void relation2()
	
{
		
System.out.println(" 2 granddaughter");
	
}
	
	

}
 public class Mother extends GrandMother
 {

	
void relation1()
	
{
	    
super.relation1();
		
System.out.println(" 2 daughter");

}

} 
public class Daughter extends Mother
{
	
	
void relation2()
	
{   
		
System.out.println("  brother");

}

class Inheritance
public static void main(String args[])

{
Daughter d=new Daughter();
d.relation1();
d.relation2();

}
}