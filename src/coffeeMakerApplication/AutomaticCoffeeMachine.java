package coffeeMakerApplication;

//      Create the coffeeMakerApplication.AutomaticCoffeeMachine class that extends coffeeMakerApplication.CoffeeMaker.
public class AutomaticCoffeeMachine extends CoffeeMaker {
//      Implement its methods with the help of Intellij.
//      Return “Automatic coffee machine” as name and 5 as brewing time.
    @Override
    protected String getName() {
        return "Automatic coffee machine";
    }

    @Override
    protected Integer getBrewingTime() {
        return 5;
    }

//      Notice that you don’t need to implement the brew method because it’s not abstract. All coffeeMakerApplication.CoffeeMakers will share
// that code without the need of implementing it. However, they need to specify their names and brewing times as
// customization.
}
