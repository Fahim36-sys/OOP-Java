class Student 
{ 
    private int id;
	private String name;
    private double cgpa;
	
	public void setId(int i)
	{id = i;}
	
	public void setName(String n)
    {name = n;}

    public void setCgpa(double c)
    {
		if(c>=0.00 && c<=4.00)
		{
		cgpa = c;	
		}
	    else
		{
		  System.out.println("Invalid CGPA for "+name +"/CGPA set to Zero");
		  cgpa = 0.00;
		}
	 }
	 
	 public int getId()
	 {
		return id; 
	 }
	 
	 public String getName()
	 {
		return name; 
	 }
	 
	 public double getCgpa()
	 {
		return cgpa; 
	 }
	 
	 public void showAll()
	 {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+cgpa);
	 }


}