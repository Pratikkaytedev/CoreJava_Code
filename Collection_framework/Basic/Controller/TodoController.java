package Collection_framework.Basic.Controller;

import Collection_framework.Basic.Model.TodoEntity;

import java.util.ArrayList;
import java.util.List;

public class TodoController {

    List<TodoEntity> list = new ArrayList<>();

    public void addTodo (TodoEntity todoEntity){
        list.add(todoEntity);
    }

    public void remove(TodoEntity todoEntity){
        list.remove(todoEntity);
    }

    public List<TodoEntity> getAllList(){

        return list ;
    }


}
