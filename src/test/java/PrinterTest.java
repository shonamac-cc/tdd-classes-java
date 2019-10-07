import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void Before(){
        printer = new Printer(100, 5);
    }

    @Test
    public void totalSheetsOfPaper(){
        assertEquals(100, printer.numberOfSheets());
    }

    @Test
    public void sheetsTotalIfEnoughPaperToPrint(){
        printer.print(10, 2);
        assertEquals(80, printer.numberOfSheets());
    }
}
