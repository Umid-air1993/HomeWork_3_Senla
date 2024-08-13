package SubTask_3;
public class IProductPart implements ILineStep {
    public IProductPart() {
    }

    public void assembleProduct(IProduct product) {
        product.setCasePart("Case installed");
        product.setMonitorPart("Monitor installed");
        product.setMotherBoard("Motherboard installed");
    }
}
