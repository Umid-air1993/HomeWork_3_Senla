public class FoodProducts {
    String name;
    int dateExpiration;
    int untilExpDate;
    String quality;
    double weight;

    public String toString() {
        return "FoodProducts: name='" + this.name + "', dateExpiration=" + this.dateExpiration + ", untilExpDate=" + this.untilExpDate + ", quality='" + this.quality + "', weight=" + this.weight + "kg\n";
    }

    public FoodProducts(String name, int dateExpiration, int untilExpDate, String quality, double weight) {
        this.name = name;
        this.dateExpiration = dateExpiration;
        this.untilExpDate = untilExpDate;
        this.quality = quality;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
}
