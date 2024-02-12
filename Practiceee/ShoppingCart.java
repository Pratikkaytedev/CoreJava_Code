package Practiceee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Item{
    private String itemName;
    private int itemPrice;

    Item (String itemName ,int itemPrice){
        this.itemName=itemName;
        this.itemPrice=itemPrice;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemPrice(int itemPrice){
        this.itemPrice=itemPrice;
    }

    public int getItemPrice(){
        return itemPrice;
    }

    public String toString(){
        return "Item Name is "+ itemName +" Item Price is "+ itemPrice;
    }

}


public class ShoppingCart {

    List<Item> list = new ArrayList<>();

    public void addItem(Item item){

        list.add(item);
    }

    public void removeItem(Item item){
        list.remove(item);
    }

    public int getTotalPrice(){

        int total=0;
        for(Item item : list){
            total += item.getItemPrice();
        }

        return total;
    }
    public void viewCart(){

        for(Item item : list){
            System.out.println(item);
        }
    }


}

class Test{
    public static void main(String[] args) {

        ShoppingCart s = new ShoppingCart();

        Item item1 = new Item("Chair",400);
        Item item2 = new Item("Table",600);
        Item item3 = new Item("Window",800);
        Item item4 = new Item("Door",1000);

        List<Item> l = new ArrayList<>();

        s.addItem(item1);
        s.addItem(item2);
        s.addItem(item3);
        s.addItem(item4);

        s.viewCart();
        s.removeItem(item3);

        System.out.println("total is "+ s.getTotalPrice());
    }
}