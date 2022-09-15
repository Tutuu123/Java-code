class StudentInfo
{
	String Name;
	String Degree;
	int rollno;

	StudentInfo(String i,String j,int k)
	{
	  Name =i;
	  Degree =j;
	  rollno= k;	
	}
	
	void getInfo()
	{
	System.out.println("Name:"+Name +"  "+"Degree:"+Degree+"  "+"rollno:"+rollno);

	}
	
	public static void main(String[] args)
	{
	 StudentInfo  d1=new StudentInfo("Neetu","Bscit",56);
	 StudentInfo  d2=new StudentInfo("Roshni","Bsccs",33);
	 StudentInfo  d3=new StudentInfo("Tutu","BCom",3);
	 d1.getInfo();
	 d2.getInfo();
	 d3.getInfo();
	}
}