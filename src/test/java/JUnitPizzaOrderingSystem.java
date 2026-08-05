import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitPizzaOrderingSystem {
    @ParameterizedTest
    // Формат: size, cheese, pepperoni, mushrooms, expectedDescription
    @CsvSource({
            "Small,       no,  no,  no,  'Small Pizza with: no toppings'",
            "Medium,      yes, no,  no,  'Medium Pizza with: Cheese'",
            "Large,       no,  yes, no,  'Large Pizza with: Pepperoni'",
            "Small,       no,  no,  yes, 'Small Pizza with: Mushrooms'",
            "Large,       yes, no,  yes, 'Large Pizza with: Cheese, Mushrooms'",
            "Medium,      yes, yes, no,  'Medium Pizza with: Cheese, Pepperoni'",
            "Small,       no,  yes, yes, 'Small Pizza with: Pepperoni, Mushrooms'",
            "Large,       yes, yes, yes, 'Large Pizza with: Cheese, Pepperoni, Mushrooms'",
            "Extra Large, yes, yes, yes, 'Extra Large Pizza with: Cheese, Pepperoni, Mushrooms'",
            "Personal,    yes, no,  no,  'Personal Pizza with: Cheese'"
    })

    void testPizzaBuilderAndDescription(String size, String cheese, String pepperoni, String mushrooms,
                                        String expectedDescription) {
        // 1. Строим пиццу по входным параметрам
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder(size);
        if(cheese.equals("yes")) builder.cheese();
        if(pepperoni.equals("yes")) builder.pepperoni();
        if(mushrooms.equals("yes")) builder.mushrooms();
        Pizza actualPizza = builder.build();

        // 2. Проверяем корректность сборки (через исправленный equals)
        // Создаем эталонный объект вручную для сравнения экземпляров
        Pizza expectedPizza = createExpectedPizza(size, cheese, pepperoni, mushrooms);
        assertEquals(expectedPizza, actualPizza, "Объекты пиццы не совпадают!");

        // 3. Проверяем строковое описание getDescription()
        assertEquals(expectedDescription, actualPizza.getDescription());

    }

    private Pizza createExpectedPizza(String size, String cheese, String pepperoni, String mushrooms) {
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder(size);
        if(cheese.equals("yes")) builder.cheese();
        if(pepperoni.equals("yes")) builder.pepperoni();
        if(mushrooms.equals("yes")) builder.mushrooms();
        return builder.build();
    }
}
