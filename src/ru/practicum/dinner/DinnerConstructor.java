package ru.practicum.dinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {

    HashMap<String, ArrayList<String>> dishesMenu;
    Random random = new Random();

    DinnerConstructor() {
        dishesMenu = new HashMap<>();
    }

    void saveDishes(String dishType, String dishName) {
        if(dishesMenu.containsKey(dishType)) {
            ArrayList<String> dishes = dishesMenu.get(dishType);
            dishes.add(dishName);
            dishesMenu.put(dishType, dishes);
            System.out.println(dishName + " успешно добавлено в категорию блюд " + dishType);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dishName);
            dishesMenu.put(dishType, dishes);
            System.out.println(dishName + " успешно добавлено в категорию блюд " + dishType);
        }

    }

    void printGeneratedCombos(Integer numberOfCombos, ArrayList<String> dishesTypes) {
        ArrayList<ArrayList<String>> combos = new ArrayList<>();
        for (int i = 0; i < numberOfCombos; i++) {
            ArrayList<String> combo = new ArrayList<>();
            for (String dishesType : dishesTypes) {
                int value = random.nextInt(dishesMenu.get(dishesType).size());
                combo.add(dishesMenu.get(dishesType).get(value));
            }

            combos.add(i, combo);
        }

        for (int i = 0; i <combos.size(); i++) {
            System.out.println("Комбо " + (i + 1));
            System.out.println(combos.get(i));
        }
    }

}
