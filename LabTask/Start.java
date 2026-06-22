public class Start{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("Shaoda","26-64009-1",3.15f);
        Student s3=new Student("Orpon","26-63953-1",2.0f);
        s1.setName("Fahim");
        s1.setId("26-64080-1");
        s1.setCgpa(3.5f);
        s1.show();
        s2.show();
        s3.show();
    }
}
    