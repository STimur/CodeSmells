package couplers.inappropriate_intimacy.replace_delegation_with_inheritance;

public class Employee extends Person {
    public void printReport() {
        System.out.println("Report for " + name);
        System.out.println("Some statistics");
        System.out.println("Summary");
    }
}
