package HomeWork6;

import HomeWork6.models.Mammal;

public class Animal {

    public static void main(String[] args){
        Cat cat = new Cat("Barsik", "Black", 1, 200, 0);
        Dog dog = new Dog("Sharik", "Red", 2, 500, 10);

        Mammal[] animal = {cat, dog};
        for (int i = 0; i < animal.length; i++){
            animal[i].infoAnimal();
            animal[i].run();
            animal[i].swim();
        }

    }
}
