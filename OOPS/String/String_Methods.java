package OOPS.String;

public class String_Methods {
    public static void main(String[] args) {
        String a = "Pratik";
        String b = "Mayu";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.concat(a));
        System.out.println(b.length());
        String c = "    Kayte   ";
        String d = "";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('k'));
    }
}