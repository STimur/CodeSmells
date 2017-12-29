package couplers.incomplete_library_class.introduce_foreign_method;

import java.util.Date;

public class Report {
    private Date previousEnd;

    //...
    void sendReport() {
        Date nextDay = nextDay(previousEnd);
        //...
    }

    private static Date nextDay(Date date) {
        return new Date(date.getYear(), date.getMonth(), date.getDate() + 1);
    }
}
