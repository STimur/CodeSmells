package bloaters.large_class.extract_subclass;

public class LaborItem extends JobItem {
    @Override
    public int getUnitPrice() {
        return 2;
    }

    @Override
    public String getEmployee() {
        return "John";
    }
}
