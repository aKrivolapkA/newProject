package src.main.java.lesson4;

public class Student {
    String name;
    int group;
    int grade;

    Student(String name,int group,int grade){
        this.name =name;
        this.group =group;
        this.grade=grade;
    }

    public void getStudentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Group: "+ group);
        System.out.println("Grade:" + grade);
    }
}
