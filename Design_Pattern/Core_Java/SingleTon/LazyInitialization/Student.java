package Design_Pattern.Core_Java.SingleTon.LazyInitialization;

public class Student {

    private static Student student;

    private Student(){

    }
    public   static Student getStudent(){

        if(student==null) {

            synchronized (Student.class) {
                student = new Student();
            }
        }
        return student;
    }

}

  class StudentImpl {

      public static void main(String[] args) {

          Student student1 =  Student.getStudent();

          Student student2 = Student.getStudent();

          System.out.println("student1 :-"+ student1.hashCode());
          System.out.println("student2 :-"+ student2.hashCode());
     }

}

//Three ways to breaaking singlton design pattern
// 1:- Reflection API to break singleton patter.
// 2:-
