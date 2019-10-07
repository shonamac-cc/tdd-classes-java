public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int drinkWater(){
        return volume - 10;
    }

    public int emptyBottle(){
        return volume - volume;
    }

    public int fillBottle(){
        return volume;
    }
}
