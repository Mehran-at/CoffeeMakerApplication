package coffeeMakerApplication;
//      Create the AutoDrip class that extends CoffeeMaker.
public class AutoDrip extends CoffeeMaker {
//      Implement its methods with the help of Intellij.
//      Return “Auto drip” as name and 6 as brewing time.
    @Override
    protected String getName() {
        return "Auto drip";
    }

    @Override
    protected Integer getBrewingTime() {
        return 6;
    }
}
