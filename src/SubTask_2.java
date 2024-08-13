public class SubTask_2 {
    public static void main(String[] args) {
        FoodProducts fp1 = new FoodProducts("Milk", 30, 15, "medium", 0.9);
        FoodProducts fp2 = new FoodProducts("Choсolate", 60, 5, "high", 0.5);
        FoodProducts fp3 = new FoodProducts("yogurt", 30, 22, "medium", 0.3);
        FoodProducts fp4 = new FoodProducts("cake", 30, 10, "good", 2.0);
        FoodProducts fp5 = new FoodProducts("pie", 30, 7, "medium", 0.3);
        WareHouse warehouse = new WareHouse();
        warehouse.addProduct(fp1);
        warehouse.addProduct(fp2);
        warehouse.addProduct(fp3);
        warehouse.addProduct(fp4);
        warehouse.addProduct(fp5);
        double totalWeight = warehouse.getTotalWeight();
        System.out.println("Total Weight Products: " + totalWeight + "kg");
}
}
