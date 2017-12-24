package bloaters.data_clumps.preserve_whole_object;

public class Sample {
    private MyRange daysTempRange;
    private MyPlan plan;

    boolean isWithinPlan() {
        return plan.withinRange(daysTempRange);
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

        public boolean withinRange(MyRange range) {
            return (range.getLow() < value && value < range.getHigh());
        }
    }
}
