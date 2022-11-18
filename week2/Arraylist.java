package week2;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> owners = new ArrayList<>();
        owners.add("ram");   //Adding a single element at a time
        owners.add("hari");
        owners.add("Shyam");
        owners.set(1,"Babu Bhaiya");
        System.out.println(owners.get(1));
    }
}
