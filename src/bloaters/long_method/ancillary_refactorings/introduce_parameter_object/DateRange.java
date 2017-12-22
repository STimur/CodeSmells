package bloaters.long_method.ancillary_refactorings.introduce_parameter_object;

import java.util.Date;

public class DateRange {
    public final Date start;
    public final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
}
