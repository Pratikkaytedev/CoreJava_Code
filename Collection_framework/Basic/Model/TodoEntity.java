package Collection_framework.Basic.Model;

public class TodoEntity {

    private int id;
    private String message;
    private int date;

    public TodoEntity(int id,String message, int date){
        this.id=id;
        this.message=message;
        this.date=date;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }

    public void setDate(int id){
        this.date=date;
    }
    public int getDate(){
        return date;
    }

    public String toString(){
        return "Id is :"+ id+" Message is "+ message + " Date is "+ date;
    }

}

