public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int drinkWater(){
        return this.volume -= 10;
    }

    public int emptyBottle(){
        return this.volume -= volume;
    }

    public int fillBottle(){
        return this.volume;
    }

    public int getVolume(){
        return this.volume;
    }
}
