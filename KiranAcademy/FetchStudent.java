package KiranAcademy;

public class FetchStudent {
    public static void main(String[] args) {
        MakeStudents ms = new MakeStudents();
        String[] nameList = ms.getNames();

        //first way
        for (String name : nameList) {
            System.out.println(name);
        }
        for (int i = 0; i <nameList.length ; i++) {
            System.out.println(nameList[i]);
        }
    }
}
