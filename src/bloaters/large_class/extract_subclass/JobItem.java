package bloaters.large_class.extract_subclass;

public class JobItem {
    public int getTotalPrice() {
        return getUnitPrice() * 4;
    }

    public int getUnitPrice() {
        return 1;
    }

    public String getEmployee() {
        return "Jim";
    }
}
