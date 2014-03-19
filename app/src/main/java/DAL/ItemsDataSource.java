package DAL;

import java.util.ArrayList;

/**
 * Created by Rohit on 3/19/14.
 */
public class ItemsDataSource {

    public static ArrayList<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Rohit", "Description1"));
        items.add(new Item("Sagar", "Description2"));
        items.add(new Item("Samarth", "Descriptio31"));
        items.add(new Item("Asit", "Description4"));

        return  items;
    }
}
