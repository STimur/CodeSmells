package object_orientation_abusers.switch_statement.replace_conditional_with_polymorphism;

public class EuropeanBird extends Bird {
    @Override
    public double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
    }
}
