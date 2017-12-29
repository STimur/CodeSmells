package object_orientation_abusers.switch_statements.replace_parameter_with_explicit_methods;

public class Rectangle {
    private int height;
    private int width;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            height = value;
            return;
        }
        if (name.equals("width")) {
            width = value;
            return;
        }
    }
}
