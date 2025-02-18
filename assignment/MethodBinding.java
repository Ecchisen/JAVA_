
class animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class dog extends animal {
    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class MethodBinding {
    public static void main(String[] args) {
        animal a = new animal(); // Animal reference and object
        animal b = new dog(); // Animal reference but Dog object
        a.move(); // runs the method in Animal class
        b.move(); // runs the method in Dog class
    }
}