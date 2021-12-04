public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void run(int _run) {
        if (_run > 500) {
            _run = 500;
            System.out.println(name + " пробежал " + _run + "-больше не осилил");
        } else if (_run < 0) {
            System.out.println("ошибка! отрицательное число");
        } else {
            System.out.println(name + " пробежал " + _run);
        }
    }

    void swim(int _swim) {
        if (_swim > 10) {
            _swim = 10;
            System.out.println(name + " проплыл " + _swim + "-больше не осилил");
        } else if (_swim < 0) {
            System.out.println("ошибка! отрицательное число");
        } else {
            System.out.println(name + " проплыл " + _swim);
        }
    }

}
