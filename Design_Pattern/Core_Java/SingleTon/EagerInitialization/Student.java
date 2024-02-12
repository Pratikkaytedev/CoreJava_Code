package Design_Pattern.Core_Java.SingleTon.EagerInitialization;

public class Student {
    private static final Student student = new Student();
    private Student (){

    }

    public static Student getStudent(){
        return student;
    }
}

class StudentImpl{

    public static void main(String[] args) {
      Student student1 =  Student.getStudent();
      Student student2 =  Student.getStudent();

        System.out.println("Student 1 :-"+ student1);
        System.out.println("Student 2 :-"+ student2);
    }
}