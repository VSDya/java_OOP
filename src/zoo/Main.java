package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Cat("Барсик"));
        animals.add(new Dog("Бобик"));
        animals.add(new Radio());

        NoiseZoo noiseZoo = new NoiseZoo(animals);
        noiseZoo.speakAll();
    }
}
