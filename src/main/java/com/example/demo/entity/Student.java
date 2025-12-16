package.com.example.demo.entity;

public class Student{

    @Id
    private int id;
    private String name;
    private String email;
    private String cgpa;

    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name=name;
    }
    public String getCgpa(){
        return this.cgpa;
    }
    public void setCgpa(String cgpa){
        this.cgpa=cgpa;
    }
}