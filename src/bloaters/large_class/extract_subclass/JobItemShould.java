package bloaters.large_class.extract_subclass;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JobItemShould {
    @Test
    public void
    calculate_total_price() {
        assertThat(new JobItem(false).getTotalPrice(), is(4));
        assertThat(new JobItem(true).getTotalPrice(), is(8));
    }

    @Test
    public void
    calculate_unit_price() {
        assertThat(new JobItem(false).getUnitPrice(), is(1));
        assertThat(new JobItem(true).getUnitPrice(), is(2));
    }

    @Test
    public void
    know_employee_name() {
        assertThat(new JobItem(false).getEmployee(), is("Jim"));
        assertThat(new JobItem(true).getEmployee(), is("John"));
    }
}
