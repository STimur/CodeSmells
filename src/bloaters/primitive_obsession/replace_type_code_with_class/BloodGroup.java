package bloaters.primitive_obsession.replace_type_code_with_class;

public class BloodGroup {
    final int id;

    public BloodGroup(String bloodGroupString) {
        if (bloodGroupString.equals("O"))
            id = 0;
        else if (bloodGroupString.equals("A"))
            id = 1;
        else if (bloodGroupString.equals("B"))
            id = 2;
        else
            id = 3;
    }
}