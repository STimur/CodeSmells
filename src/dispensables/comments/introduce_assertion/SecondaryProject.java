package dispensables.comments.introduce_assertion;

public class SecondaryProject {
    private static final double NULL_EXPENSE = 0;
    private double expenseLimit;
    private PrimaryProject primaryProject;

    double getExpenseLimit() {
        // should have either expense limit or a primary project
        return (expenseLimit != NULL_EXPENSE) ?
                expenseLimit :
                primaryProject.getMemberExpenseLimit();
    }
}

class PrimaryProject {
    public double getMemberExpenseLimit() {
        return 0;
    }
}
