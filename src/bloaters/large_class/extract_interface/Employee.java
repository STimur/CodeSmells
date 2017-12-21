package bloaters.large_class.extract_interface;

public class Employee implements Billable {
    @Override
    public int getRate() {
        return 0;
    }

    @Override
    public boolean hasSpecialSkill() {
        return false;
    }

    public String getName() {
        return null;
    }

    public String getDepartment() {
        return null;
    }
}
