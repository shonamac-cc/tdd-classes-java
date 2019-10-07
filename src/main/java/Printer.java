public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int numberOfSheetsLeft(){
        return this.paper;
    }

    public int amountOfTonerLeft(){
        return this.toner;
    }

    public int print(int numOfCopies, int numOfPages){
        int paperUsed = numOfCopies * numOfPages;
        if (this.paper >= paperUsed) {
            return this.paper -= paperUsed;
        }else {
            return this.paper;
        }
    }

    public int printTonerLeft(int numOfCopies, int numOfPages){
        int paperUsed = numOfCopies * numOfPages;
        return this.toner -= paperUsed;
    }
}
