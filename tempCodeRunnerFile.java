//IMPORTANT
//MOVE THIS FILE (Main.java) OUTSIDE THE QNO2 FOLDER
//THEN COMPILE Rectangle.java FIRST AND THEN ONLY Main.java

import com.example.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.printf("\nArea of rectangle is: %d", rect.area());
    }
}
