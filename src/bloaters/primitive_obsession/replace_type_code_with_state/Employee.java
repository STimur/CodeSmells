package bloaters.primitive_obsession.replace_type_code_with_state;

public class Employee {
    final int ENGINEER = 0;
    final int SALESMAN = 1;
    int type;

    public void changeType(int type) {
        this.type = type;
    }
}
