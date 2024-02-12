package Collection_framework.Basic.View;

import Collection_framework.Basic.Controller.TodoController;
import Collection_framework.Basic.Model.TodoEntity;

import java.util.ArrayList;
import java.util.List;

public class TodoView {
    public static void main(String[] args) {

        TodoController tc = new TodoController();

        TodoEntity t1 = new TodoEntity(1,"What is java",23);
        TodoEntity t2 = new TodoEntity(2,"What is Python",25);
        TodoEntity t3 = new TodoEntity(3,"What is Java Script",27);
        TodoEntity t4 = new TodoEntity(4,"What is Collection",29);



        tc.addTodo(t1);
        tc.addTodo(t2);
        tc.addTodo(t3);
        tc.addTodo(t4);

        System.out.println(tc.getAllList());

tc.remove(t3);

        System.out.println(tc.getAllList());

    }
}
