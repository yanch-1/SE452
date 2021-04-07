import java.util.*;
public class Supplier {
    String s_id;

    List<Item> supply_List;
    public Supplier(String id){
        this.s_id = id;
        //this.supply_List = (database search) or new List;
    }
    public void createNewItem(String name, int quantity){
        String itemId = s_id + Math.random() * 10000000/1;
        Item newItem = new Item(itemId,name,quantity,s_id);
        supply_List.add(newItem);
        
        // update the dataBase here
    }
    public void add(int pos, int quantity){
        supply_List.get(pos).add(quantity);

        // update the dataBase here
    }

    public void subtract(int pos, int quantity){
        // pos is from frontend selection 
        supply_List.get(pos).subtract(quantity);

        // update the dataBase here
    }

    public void removeItem(int pos){
        supply_List.remove(pos);
        
         // update the dataBase here
    }

}
