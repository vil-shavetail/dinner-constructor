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
        dishesMenu.computeIfAbsent(dishType, k -> new ArrayList<>()).add(dishName);
        System.out.println(dishName + " успешно добавлено в категорию блюд " + dishType);
    }

    void printGeneratedCombos(Integer numberOfCombos, ArrayList<String> dishesTypes) {
        ArrayList<ArrayList<String>> combos = new ArrayList<>();
        for (int i = 0; i < numberOfCombos; i++) {
            ArrayList<String> combo = new ArrayList<>();
            for (String dishesType : dishesTypes) {
                ArrayList<String> dishes = dishesMenu.get(dishesType);
                int value = random.nextInt(dishes.size());
                combo.add(dishes.get(value));
            }

            combos.add(i, combo);
        }

        for (int i = 0; i <combos.size(); i++) {
            System.out.println("Комбо " + (i + 1));
            System.out.println(combos.get(i));
        }
    }

    Boolean checkType(String dishType) {
        return dishesMenu.containsKey(dishType);
    }

}
