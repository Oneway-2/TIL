package CompositePattern;

import java.util.ArrayList;
import java.util.List;

// Composite 역할
public class AnimalGroup implements IAnimal {
    
    private List<IAnimal> animalGroup = new ArrayList<IAnimal>();

    public void speak() {
        for (IAnimal animal : animalGroup) {
            animal.speak();
        }
    }

    public void add(IAnimal animal) {
        animalGroup.add(animal);
    }

    public void remove(IAnimal animal) {
        animalGroup.remove(animal);
    }    
}
