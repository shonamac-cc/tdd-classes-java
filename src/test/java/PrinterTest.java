import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void Before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void totalSheetsOfPaper(){
        assertEquals(100, printer.numberOfSheetsLeft());
    }

    @Test
    public void amountOfToner(){
        assertEquals(500, printer.amountOfTonerLeft());
    }

    @Test
    public void sheetsTotalIfEnoughPaperToPrint(){
        printer.print(10, 2);
        assertEquals(80, printer.numberOfSheetsLeft());
    }

    @Test
    public void tonerLeftAfterPrint(){
        printer.printTonerLeft(10, 2);
        assertEquals(480, printer.amountOfTonerLeft());
    }
}
