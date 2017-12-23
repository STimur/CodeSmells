package bloaters.primitive_obsession.replace_type_code_with_class;

public class Person {
    final int O = 0;
    final int A = 1;
    final int B = 2;
    final int AB = 3;
    int bloodgroup;

    public Person(String bloodTypeString) {
        if (bloodTypeString.equals("O"))
            bloodgroup = O;
        if (bloodTypeString.equals("A"))
            bloodgroup = A;
        if (bloodTypeString.equals("B"))
            bloodgroup = B;
        if (bloodTypeString.equals("AB"))
            bloodgroup = AB;
    }
}
