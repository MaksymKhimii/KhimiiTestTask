package ua.khimii.solution;


import ua.khimii.sample.IDateSorter;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

/**
 * my solution of current task
 *
 * @see IDateSorter
 */
public class IDateSorterImp implements IDateSorter {
    private static final Locale LOCALE = Locale.forLanguageTag("en");

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithR = new ArrayList<>();
        List<LocalDate> datesWithoutR = new ArrayList<>();
        Month month;
        for (LocalDate localDate : unsortedDates) {
            month = localDate.getMonth();
            String monthName = month.getDisplayName(TextStyle.FULL_STANDALONE, LOCALE);
            if (monthName.contains("r")) {
                datesWithR.add(localDate);
            } else {
                datesWithoutR.add(localDate);
            }
        }
        Collections.sort(datesWithR);
        datesWithoutR.sort(Collections.reverseOrder());
        datesWithR.addAll(datesWithoutR);
        return datesWithR;
    }
}
