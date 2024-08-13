public class WareHouse {
    FoodProducts[] products = new FoodProducts[5];

    WareHouse() {
    }

    public void addProduct(FoodProducts fp) {
        for(int i = 0; i < this.products.length; ++i) {
            if (this.products[i] == null) {
                this.products[i] = fp;
                break;
            }
        }

    }

    public double getTotalWeight() {
        double weight = 0.0;

        for(int i = 0; i < this.products.length; ++i) {
            if (this.products[i] != null) {
                weight += this.products[i].getWeight();
            }
        }

        return weight;
    }
}
