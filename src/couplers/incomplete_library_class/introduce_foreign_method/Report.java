package couplers.incomplete_library_class.introduce_foreign_method;

import java.util.Date;

public class Report {
    private Date previousEnd;

    //...
    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(),
                previousEnd.getMonth(), previousEnd.getDate() + 1);
        //...
    }
}
