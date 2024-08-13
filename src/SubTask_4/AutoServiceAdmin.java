package SubTask_4;

import java.util.ArrayList;
import java.util.List;

public class AutoServiceAdmin {
    List<Master> masters = new ArrayList();
    List<Garage> garage = new ArrayList();
    List<Order> services = new ArrayList();

    public AutoServiceAdmin() {
    }

    public static void main(String[] args) {
        AutoServiceAdmin admin = new AutoServiceAdmin();
        admin.addMaster("Aleksandr");
        admin.addMaster("Alice");
        admin.addGarageSpace(2);
        admin.addGarageSpace(1);
        Master aleksandr = (Master)admin.masters.get(0);
        Garage garage1 = (Garage)admin.garage.get(0);
        admin.addOrder("Change engine", aleksandr, garage1);
        Order changeEngine = (Order)admin.services.get(0);
        System.out.println("Order for change engine closed:  " + String.valueOf(changeEngine));
    }

    public void addMaster(String master) {
        Master m = new Master(master);
        this.masters.add(m);
    }

    public void removeMaster(String master) {
        this.masters.remove(master);
    }

    public void addGarageSpace(int garageSpace) {
        Garage g = new Garage(garageSpace);
        this.garage.add(g);
    }

    public void removeGarageSpace(int garageSpace) {
        this.garage.remove(garageSpace);
    }

    public void addOrder(String description, Master master, Garage garage) {
        Order newOrder = new Order(description, master, garage);
        this.services.add(newOrder);
    }

    public void removeOrder(Order order) {
        this.services.remove(order);
    }

    public void closedOrder(Order order) {
        order.isClosed = true;
    }

    public void cancelOrder(Order order) {
        this.services.remove(order);
    }
}
