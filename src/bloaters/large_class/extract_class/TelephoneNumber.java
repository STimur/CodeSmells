package bloaters.large_class.extract_class;

public class TelephoneNumber {
    private String officeNumber;
    private String officeAreaCode;

    public String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }
}