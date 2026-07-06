import java.lang.reflect.Method;

public class ClassBasics {
    public static void main(String[] args) throws Exception {
        Student s1=new Student(101,"name",20,"AI&DS");
        Student s2=new Student(102,"GOO pi",72,"AI Topper");
/*
        s1.id=1;
        s1.name="LOQ";
        s1.age=2;
        s1.dept="Ai&Ds";
        */

//        Access the class like hacker mode for accessing the private class.
        Method privateMethod=Student.class.getDeclaredMethod("displaydept");
        privateMethod.setAccessible(true);
        privateMethod.invoke(s1);
        s1.display();
        s2.display();
//        s1.displaydept();
//        Student.name="LOQ";
//        Student.id=101;
//        Student.age=2;
//        Student.display();
//        Student.name="LOQ Rq";
//        Student.id=102;
//        Student.age=1;
//        Student.display();
    }
}
class Student{
   int id;
   String name;
   int age;
   String dept;
  Student(){
       System.out.println("Student constructor");
   }
   Student(int id,String name,int age,String dept){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dept=dept;
    }
    public  void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+age);
//        displaydept();
    }
    private  void displaydept(){
        System.out.println("Dept: "+dept);
    }
}

