package bloaters.long_method.ancillary_refactorings;

public class PreserveWholeObject {
    private MyRange daysTempRange;
    private MyPlan plan;

    boolean isWithinPlan() {
        int low = daysTempRange.getLow();
        int high = daysTempRange.getHigh();
        return plan.withinRange(low, high);
    }

    private class MyRange {
        public int getLow() {
            return 0;
        }

        public int getHigh() {
            return 0;
        }
    }

    private class MyPlan {
        final int value = 10;

        public boolean withinRange(int low, int high) {
            return (low < value && value < high);
        }
    }
}
