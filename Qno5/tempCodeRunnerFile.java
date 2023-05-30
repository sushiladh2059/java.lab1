

// Define the Drawable interface
interface Drawable {
    void draw();
}

// Implement the Drawable interface in the Circle class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Main class to demonstrate the usage of interfaces
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle();
        
        // Call the draw() method on the Circle object
        circle.draw();
    }
}
