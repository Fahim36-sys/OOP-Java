class Student{
    private  String name;
    private String id;
    private float cgpa;
    public static float probationLimit=2.5f;
    public Student(String n, String i, float cg){
        setName(n);
        setId(i);
        setCgpa(cg);
    }
    public void setName(String n){
        name=n;
    }
    public void setId(String i){
        id=i;
    }
    public void setCgpa(float cg){
        if(cg >= 0.0f && cg <= 4.0f){
            cgpa=cg;
        }
        else{
            cgpa=0.0f;
        }
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public float getCgpa(){
        return cgpa;
    }
    public Student(){
        name="";
        id="";
        cgpa=0.0f;
    }
    public void show(){
        if(cgpa < probationLimit){
            System.out.println(name+" is on probation!");
        }
        if(cgpa>4.0f || cgpa<0.0f){
            System.out.println(name+" has an invalid CGPA!");
        }
        System.out.println("---------------------------------");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
        System.out.println("---------------------------------");
    }
}
