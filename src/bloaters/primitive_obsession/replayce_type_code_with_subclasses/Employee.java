package bloaters.primitive_obsession.replayce_type_code_with_subclasses;

public class Employee {
    final int ENGINEER = 0;
    final int SALESMAN = 1;
    int type;

    public String getProfession() {
        if (type == ENGINEER)
            return "Engineer";
        if (type == SALESMAN)
            return "SALESMAN";
        return "UNDEFINED";
    }
}
