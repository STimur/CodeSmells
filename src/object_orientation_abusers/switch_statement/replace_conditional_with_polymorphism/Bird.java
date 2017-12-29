package object_orientation_abusers.switch_statement.replace_conditional_with_polymorphism;

public class Bird {
    private BirdType type;
    private int numberOfCoconuts;
    private boolean isNailed;
    private double voltage;

    double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed(double voltage) {
        return 0;
    }

    private double getLoadFactor() {
        return 0;
    }

    private double getBaseSpeed() {
        return 0;
    }
}

enum BirdType {
    EUROPEAN, AFRICAN, NORWEGIAN_BLUE
}
