package coffeeMakerApplication;
//      Create the FrenchPress class that extends CoffeeMaker.
public class FrenchPress extends CoffeeMaker {
//      Implement its methods with the help of Intellij.
//      Implement its methods with the help of Intellij. Return “French press” as name and 10 as brewing time.
    @Override
    protected String getName() {
        return "French press";
    }

    @Override
    protected Integer getBrewingTime() {
        return 10;
    }
}