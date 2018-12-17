package coffeeMakerApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//      Create the CoffeeMakers class.
public class CoffeeMakers {
//    It has the asList static method that returns the three coffeeMakerApplication.CoffeeMakers as a list of coffeeMakerApplication.CoffeeMaker.
    static List<CoffeeMaker> getCoffeeMakers() {
        List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutomaticCoffeeMachine(), new FrenchPress(),new AutoDrip());
        return coffeeMakers;
    }

//      It has the get static method that receives a String representing the name of the coffee maker you want to
// receive, and it returns an Optional with the coffeeMakerApplication.CoffeeMaker you wanted if it found it within its list of available ones.
// Otherwise an empty one.

    public static Optional<CoffeeMaker> getCoffeeMakersList(String name) {
        for (CoffeeMaker coffeeMaker : getCoffeeMakers()) {
            if (coffeeMaker.getName().equalsIgnoreCase(name)) {
                return Optional.of(coffeeMaker);
            }
        }return Optional.empty();
    }
}
