package dispensables.duplicate_code.extract_class;

public class Employee {
    public String name;
    private String officeNumber;
    private String officeAreaCode;

    String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }
}
