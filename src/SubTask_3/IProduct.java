package SubTask_3;

public class IProduct {
    private String monitorPart;
    private String motherBoard;
    private String casePart;

    public IProduct() {
    }

    public void setMonitorPart(String monitorPart) {
        this.monitorPart = monitorPart;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setCasePart(String casePart) {
        this.casePart = casePart;
    }

    public String getMonitorPart() {
        return this.monitorPart;
    }

    public String getMotherBoard() {
        return this.motherBoard;
    }

    public String getCasePart() {
        return this.casePart;
    }
}