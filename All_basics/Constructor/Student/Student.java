package All_basics.Constructor.Student;

public class Student {

        String name;
        int roll;
        String college= "Dharampeth";
        Student (int r, String n){
            name = n;
            roll = r;
        }
        void display (){
            System.out.println(roll+ " "+ college+" " + name);
        }
}
class main{
    public static void main(String[] args) {
        Student s1= new Student(112,"Pratik");
        Student s2= new Student(113,"Mayu");
        Student s3= new Student(114,"Jay");
        s1.display();
        s2.display();
        s3.display();
    }
}
