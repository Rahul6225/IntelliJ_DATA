interface A {
    void show(); // Interface method (implicitly public and abstract)
}

interface B {
    void show();
}

class Multiple implements A, B {
    @Override
    public void show() {
        System.out.println("Overridden Method in Multiple");
    }
}

public class MultipleInheritanceByInterface {
    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.show(); // This will call the show() method in the Multiple class
    }
}
