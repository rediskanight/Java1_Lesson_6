public class AnimalsApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Барбос");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Пушок");
        Animal animal = new Animal("Кракен");
        dog1.run(700);
        dog2.run(-3);
        dog2.swim(100);
        cat1.run(100);
        animal.run(1000);
        cat2.swim(300);
        cat3.swim(100);
        animal.swim(10000);
}}
