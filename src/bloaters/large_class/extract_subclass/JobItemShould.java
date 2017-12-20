package bloaters.large_class.extract_subclass;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JobItemShould {
    private JobItem jobItem;

    @Before
    public void setUp() throws Exception {
        jobItem = new JobItem();
    }

    @Test
    public void
    calculate_total_price_for_job_item() {
        assertThat(jobItem.getTotalPrice(), is(4));
    }

    @Test
    public void
    calculate_total_price_for_labor_item() {
        jobItem = new LaborItem();
        assertThat(jobItem.getTotalPrice(), is(8));
    }

    @Test
    public void
    calculate_unit_price_for_job_item() {
        assertThat(jobItem.getUnitPrice(), is(1));
    }

    @Test
    public void
    calculate_unit_price_for_labor_item() {
        jobItem = new LaborItem();
        assertThat(jobItem.getUnitPrice(), is(2));
    }

    @Test
    public void
    know_employee_name_for_job_item() {
        assertThat(jobItem.getEmployee(), is("Jim"));
    }

    @Test
    public void
    know_employee_name_for_labor_item() {
        jobItem = new LaborItem();
        assertThat(jobItem.getEmployee(), is("John"));
    }
}
