package object_orientation_abusers.switch_statement.replace_conditional_with_polymorphism;

public class NorwegianBlueBird extends Bird {
    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
