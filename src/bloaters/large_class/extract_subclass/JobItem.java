package bloaters.large_class.extract_subclass;

public class JobItem {
    private boolean isLaborItem;

    public JobItem(boolean isLaborItem) {
        this.isLaborItem = isLaborItem;
    }

    public int getTotalPrice() {
        return getUnitPrice() * 4;
    }

    public int getUnitPrice() {
        if (isLaborItem)
            return 2;
        return 1;
    }

    public String getEmployee() {
        if (isLaborItem)
            return "John";
        return "Jim";
    }
}
