package bloaters.primitive_obsession.replace_type_code_with_class;

public class Person {
    final BloodGroup bloodGroup;

    public Person(String bloodGroupString) {
        bloodGroup = new BloodGroup(bloodGroupString);
    }
}
