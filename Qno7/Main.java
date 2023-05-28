class Outer {
    private int value;

    public Outer(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value in outer class: " + value);
    }

    class Inner {
        public void changeValue(int newValue) {
            value = newValue;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(10);

        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.changeValue(20);

        outer.display();
    }
}

