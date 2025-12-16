package.com.example.demo.entity;
import jakarta.persistence.*;


@Entity
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
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email ){
        this.email=email;
    }
    public String getCgpa(){
        return this.cgpa;
    }
    public void setCgpa(String cgpa){
        this.cgpa=cgpa;
    }

     public Student(int id,String name,String email,String cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }
    public Student(){

    }

}