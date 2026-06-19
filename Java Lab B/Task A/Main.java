public class Main
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setId(26640801);
		s1.setName("Fahim Hasnat");
		s1.setCgpa(4.00);
		
		System.out.println("ID: "+s1.getId());
		System.out.println("Name: "+s1.getName());
		System.out.println("CGPA: "+s1.getCgpa());
		
	}
}