class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){ // Copy Constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}

public class OOps2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akash";
        s1.age = 23;
       

        Student s2 = new Student(s1);
        s2.printInfo();
    }
    
    
}
