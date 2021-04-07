import java.util.*;
public class Customer {
    private String c_id;
    private List<Order> Inprogress_orders;
    private List<Order> canceled_orders;
    private List<Order> finished_orders;
    private List<Item> shopping_cart;
    public Customer(String id){
        this.c_id = id;
        //this.Inprogress_orders = (database search) or new List;
        //this.canceled_orders = (database search) or new List;
        //this.finished_orders = (database search) or new List;
        //this.cart = (database search if there are items left in the cart) or new List;

    }
    public void cancel_Order(int pos){
        Order to_cancel = Inprogress_orders.remove(pos);
        to_cancel.cancel();
        this.canceled_orders.add(to_cancel);
         //.....
        // update the database here;
    }
    public void place_Order(){
        this.Inprogress_orders.add(new Order(c_id,this.shopping_cart));
        this.shopping_cart = new ArrayList<>();
        //.....
        // update the database here;
    }
    public void receivedOrder(int pos){
        Order received = Inprogress_orders.remove(pos);
        received.fullfil();
        this.finished_orders.add(received);
         //.....
        // update the database here;
    }

}