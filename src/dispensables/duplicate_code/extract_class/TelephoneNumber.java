package dispensables.duplicate_code.extract_class;

public class TelephoneNumber {
    private String officeNumber;
    private String officeAreaCode;

    String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }
}