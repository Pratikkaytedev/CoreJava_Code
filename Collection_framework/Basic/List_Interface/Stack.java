package Collection_framework.Basic.List_Interface;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack s=new java.util.Stack();
        s.push("one");
        s.push("two");
        s.push("three");
        s.push("four");
        s.push("five");
        s.push("six");

        System.out.println(s.pop());
        System.out.println(s);
    }

    }

