package ua.khimii.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for task
 *
 * @see IDateSorterImp
 */
public class IDateSorterImpTest {
    private IDateSorterImp iDateSorterImp;
    private List<LocalDate> unsortedDateList;
    private List<LocalDate> expectedDateList;

    @Before
    public void init() {
        iDateSorterImp = new IDateSorterImp();
        unsortedDateList = new ArrayList<>();
        unsortedDateList.add(LocalDate.of(2005, 7, 1));
        unsortedDateList.add(LocalDate.of(2005, 1, 2));
        unsortedDateList.add(LocalDate.of(2005, 1, 1));
        unsortedDateList.add(LocalDate.of(2005, 5, 3));
        expectedDateList = new ArrayList<>();
        expectedDateList.add(LocalDate.of(2005, 1, 1));
        expectedDateList.add(LocalDate.of(2005, 1, 2));
        expectedDateList.add(LocalDate.of(2005, 7, 1));
        expectedDateList.add(LocalDate.of(2005, 5, 3));
    }

    @Test
    public void IDataSorterTest() {
        List<LocalDate> actualDateList = (List<LocalDate>) iDateSorterImp.sortDates(unsortedDateList);
        Assert.assertEquals(expectedDateList, actualDateList);
    }
}
