package bloaters.long_method.extract_method;

public class Sample {
    private String name;

    void printOwing() {
        printBanner();

        //print details
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private String getOutstanding() {
        return null;
    }

    private void printBanner() {

    }
}
