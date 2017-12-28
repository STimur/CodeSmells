package dispensables.lazy_class.inline_class;

public class Person {
    public String name;
    private String officeNumber;
    private String officeAreaCode;

    public String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }
}
