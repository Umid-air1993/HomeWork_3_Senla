package SubTask_4;

public class Order {
    String description;
    Master master;
    Garage garage;
    boolean isClosed;

    public String toString() {
        String var10000 = this.description;
        return "Order: description='" + var10000 + "', master=" + String.valueOf(this.master) + ", garage=" + String.valueOf(this.garage) + ", isClosed=" + this.isClosed;
    }

    public Order(String description, Master master, Garage garage) {
        this.description = description;
        this.master = master;
        this.garage = garage;
        this.isClosed = false;
    }
}
