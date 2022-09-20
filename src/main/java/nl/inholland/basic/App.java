package nl.inholland.basic;

interface A {
    default void hello() {
        System.out.println("Hello from A");
    }

    ;
}

interface B extends A {
    @Override
    default void hello() {
        System.out.println("Hello from B");
    }
}

interface C extends A {
    @Override
    default void hello() {
        System.out.println("Hello from C");
    }
}

public class App {
    public static void main(String[] args) {
        D d = new D();
        d.hello();
    }
}

class D implements B, C {

}


