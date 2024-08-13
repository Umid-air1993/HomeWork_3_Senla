package SubTask_3;

public class IAssemblyLine {
        ILineStep caseStep;
        ILineStep motherBoardStep;
        ILineStep monitorStep;

        public IAssemblyLine(ILineStep caseStep, ILineStep motherBoardStep, ILineStep monitorStep) {
            this.caseStep = caseStep;
            this.motherBoardStep = motherBoardStep;
            this.monitorStep = monitorStep;
        }

        public IProduct assembleProduct() {
            IProduct iProduct = new IProduct();
            this.caseStep.assembleProduct(iProduct);
            this.motherBoardStep.assembleProduct(iProduct);
            this.monitorStep.assembleProduct(iProduct);
            return iProduct;
        }

        public static void main(String[] args) {
            SubTask_3.IAssemblyLine assemblyLine = new SubTask_3.IAssemblyLine(new IProductPart(), new IProductPart(), new IProductPart());
            IProduct product = assemblyLine.assembleProduct();
            System.out.println("Laptop assemled:");
            System.out.println("Case assemled: " + product.getCasePart());
            System.out.println("Motherboard assemled: " + product.getMotherBoard());
            System.out.println("Monitor assembled: " + product.getMonitorPart());
        }
}
