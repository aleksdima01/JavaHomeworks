package OOPHomework1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Product> listOfBottles = new ArrayList<>();
        List<HotDrink> listOfHotDrinks = new ArrayList<>();
        List<Product> listOfHotDrinks2 = new ArrayList<>();
        HotDrink hotDrink1 = new HotDrink("Кофе", 130.0, 0.3, 88);
        HotDrink hotDrink2 = new HotDrink("Чай", 80.0, 0.4, 92);
        HotDrink hotDrink3 = new HotDrink("Кофе с молоком", 140.0, 0.3, 88);
        BottleOfWater bottleOfWater1 = new BottleOfWater("Эвиан", 80.5, 0.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Аква Минерале", 60.0, 0.5);
        listOfBottles.add(bottleOfWater1);
        listOfBottles.add(bottleOfWater2);
        listOfHotDrinks.add(hotDrink1);
        listOfHotDrinks.add(hotDrink2);
        listOfHotDrinks2.add(hotDrink3);
        BottleOfWaterVendingMachine machine1 = new BottleOfWaterVendingMachine(listOfBottles);
        HotDrinkVendingMachine machine2 = new HotDrinkVendingMachine(listOfHotDrinks);
        System.out.println(machine1);
        System.out.println(machine2.addProduct(listOfHotDrinks2));
        System.out.println(machine2);
        System.out.println(machine2.getProduct("Кофе с молоком"));
        System.out.println(machine2.getProduct("Кофе", 0.3, 88));

    }
}
