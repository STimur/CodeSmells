package object_orientation_abusers.switch_statements.replace_conditional_with_polymorphism;

public abstract class Bird {
    protected int numberOfCoconuts;
    protected boolean isNailed;
    protected double voltage;

    abstract double getSpeed();

    protected double getBaseSpeed(double voltage) {
        return 0;
    }

    protected double getLoadFactor() {
        return 0;
    }

    protected double getBaseSpeed() {
        return 0;
    }
}