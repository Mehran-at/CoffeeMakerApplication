package coffeeMakerApplication;
//      Create the coffeeMakerApplication.CoffeeMaker abstract class.
public abstract class CoffeeMaker {
//      It has the getName abstract method that returns a String.
    protected abstract String getName();
//      It has the getBrewingTime abstract method that returns an Integer.
    protected abstract Integer getBrewingTime();
//      It has the brew method that returns a coffeeMakerApplication.Coffee. It uses the getName and getBrewingTime methods to create a coffeeMakerApplication.Coffee
// and returns it.
    public Coffee brew() {
        String madeBy= getName();
        Integer brewingTime = getBrewingTime();
        return new Coffee(madeBy, brewingTime);
    }
}
