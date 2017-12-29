package couplers.incomplete_library_class.introduce_local_extension;

import java.util.Date;

public class MyDate extends Date {
    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
