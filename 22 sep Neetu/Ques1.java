class bank
{ 
 
int getRateOfInterest()

{

return 4;

}  

}  
 

class BOI extends bank

{  
int getRateOfInterest()

{

return 16;

}  

} 
 
class ICICI extends bank

{  

int getRateOfInterest()

{

return 2;

} 
 
}
 

class Ques1{  

public static void main(String args[])

{  

BOI s=new BOI();
  ICICI a=new ICICI(); 
 
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
 
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}
  
}