package design.problems.vehiclerental.vehicle;

import java.util.ArrayList;
import java.util.List;

public class UnavailabilityDates {
    // for these date ranges, vehicle is not available.
    // (5th March 2024, 10th March 2024), (24th March 2024, 26th March 2024)
    private List<DateRange> dateRangeList;

    public UnavailabilityDates() {
        dateRangeList = new ArrayList<>();
    }

    public void addDateRange(DateRange dateRange) {
        dateRangeList.add(dateRange);
    }
}



