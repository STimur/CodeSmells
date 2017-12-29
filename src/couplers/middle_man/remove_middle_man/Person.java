package couplers.middle_man.remove_middle_man;

public class Person {
    private Department department;

    public Manager getManager() {
        return department.getManager();
    }
}
