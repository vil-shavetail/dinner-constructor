# Конструктор обедов.

## Основная функциональность.
1. Добавление категорий блюд и блюд в меню.
2. Формирование вариантов бизнес-ланчей на основе, сформированного ранее меню.
3. Выход из программы, завершение работы.

## Доступные методы:
1. Сохранение, введённых пользователем блюд и категорий блюд в меню.
```
saveDishes(String dishType, String dishName)
```
*где: dishType - категория блюда (например: первое, воторое, напитки);
dishName - наименование блюа (например: солянка, шурпа).*

2. Генерация и вывод вариантов бизнес-ланчей.
```
printGeneratedCombos(Integer numberOfCombos, ArrayList<String> dishesTypes)
```
*где: numberOfCombos - количество вариантов бизнес-ланчей, которые необходимо сформировать,
dishesTypes - списко категорий блюд.*