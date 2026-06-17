class Student{
    public  String name;
    public String id;
    public float cgpa;
    public Student(String n, String i, float cg){
        name=n;
        id=i;
        cgpa=cg;
    }
    public Student(){
        name="";
        id="";
        cgpa=0.0f;
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
    }
}