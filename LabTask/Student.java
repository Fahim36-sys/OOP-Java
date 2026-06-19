class Student{
    private  String name;
    private String id;
    private float cgpa;
    public Student(String n, String i, float cg){
        name=n;
        id=i;
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
            System.out.println("Invalid CGPA for "+name+"/CGPA set to 0.0");
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
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
    }
}
