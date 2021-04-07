import java.util.*;
public class Order {
    private String id; // user id + random 10 digits
    private List<Item> itemList;
    private String status;
    public Order(String userid, List<Item> cart){
        this.id = ""+ userid + Math.random()*1000000000/1;
        this.itemList = cart;
        this.status = "Processing";
    }
    private String getOrderId(){
        return this.id;
    }
    private void cancel(){
        status = "Cancel";
    }

}
