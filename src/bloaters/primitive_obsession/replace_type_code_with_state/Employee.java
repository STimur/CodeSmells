package bloaters.primitive_obsession.replace_type_code_with_state;

public class Employee {
    EmployeeType type;

    public void changeType(EmployeeType type) {
        this.type = type;
    }
}
