package object_orientation_abusers.switch_statements.replace_conditional_with_polymorphism;

public class AfricanBird extends Bird {
    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
