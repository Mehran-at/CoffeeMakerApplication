package coffeeMakerApplication;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//      Create the coffeeMakerApplication.CoffeeMakerApplication class and write the following instructions in its main
// method:
//-------------------------------------------------------
//Automatic coffee machine brewed a coffee and it took 5 minutes
//French press brewed a coffee and it took 10 minutes
//Auto drip brewed a coffee and it took 6 minutes
//Automatic coffee machine brewed a coffee and it took 5 minutes
//French press brewed a coffee and it took 10 minutes
//Auto drip brewed a coffee and it took 6 minutes
//The coffee maker with the name Moka pot is not available
//-------------------------------------------------------
public class CoffeeMakerApplication {
    public static void main(String[] args) {
//      Use the coffeeMakerApplication.CoffeeMakers class to receive all available coffee makers as a list.
//      For each one of them, brew a coffeeMakerApplication.Coffee and display the madeBy and brewedTime from the
// coffeeMakerApplication.Coffee.
        List<CoffeeMaker> coffeeMakers = CoffeeMakers.getCoffeeMakers();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee = coffeeMaker.brew();
            display(coffee);
        }

        List<String> names = Arrays.asList("Automatic coffee machine", "French press", "Auto drip");
        for (String name : names) {
            displayBrewedCoffeeWithCoffeeMaker(name);
        }

        String name = "Moka pot";
        Optional<CoffeeMaker> maker =CoffeeMakers.getCoffeeMakersList(name);
        if (!maker.isPresent()) {
            System.out.println("The coffee maker with the name " + name + " is not available");
        }
    }
    private static void display(Coffee coffee) {
        System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
    }

    private static void displayBrewedCoffeeWithCoffeeMaker(String name) {
        Optional<CoffeeMaker> maker = CoffeeMakers.getCoffeeMakersList(name);
        if (maker.isPresent()) {
            Coffee coffee = maker.get().brew();
            display(coffee);
        }
    }
//      Use the coffeeMakerApplication.CoffeeMakers class to get one by one each coffeeMakerApplication.CoffeeMaker.
// Check with the Optional if they are present, and
// if so, use them to brew a coffeeMakerApplication.Coffee and display the madeBy and brewedTime from it.

//    Use the coffeeMakerApplication.CoffeeMakers class to get one maker that does not exist. Check with the Optional
// that it is not present
// and display a message saying that this particular coffee maker is not available.
}