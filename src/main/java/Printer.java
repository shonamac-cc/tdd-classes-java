public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int numberOfSheets(){
        return this.paper;
    }

    public int print(int num1, int num2){
        int paperUsed = num1 * num2;
        if (this.paper > paperUsed) {
            return this.paper -= paperUsed;
        }else {
            return this.paper;
        }
    }
}
