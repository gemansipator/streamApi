import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        // Filter   отфильтруем хищников
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList()); //сборка в коллекцию
//        predators.forEach(System.out::println);

        // Sort   отсортируем по возрасту
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
        // All match, Any match, None match, Max, Min, Group




    }
    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }
}