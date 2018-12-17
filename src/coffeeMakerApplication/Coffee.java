package coffeeMakerApplication;

//      Create the coffeeMakerApplication.Coffee class.
public class Coffee {
//    It has the madeBy String attribute and the brewedTime Integer attribute.
    private String madeBy;
    private Integer brewedTime;

//    They are provided via constructor.
    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

//    It has the getMadeBy and getBrewedTime methods.
    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }
}
