package All_basics.Strings;

public class Count_caracter {

    public static void main(String[] args) {

        String name="hello world how are you";
        int count=0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("total present caracters are "+ count);
    }
}