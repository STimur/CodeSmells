package bloaters.long_method;

public class ExtractMethod {
    private String name;

    void printOwing() {
        printBanner();
        printDetails();
    }

    private void printDetails() {
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private String getOutstanding() {
        return null;
    }

    private void printBanner() {
    }
}
