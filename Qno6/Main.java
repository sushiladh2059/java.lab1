import java.lang.reflect.Method;

class DynamicClass {
    public void displayMessage() {
        System.out.println("Hello, Reflection!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Load the DynamicClass dynamically
            Class<?> dynamicClass = Class.forName("DynamicClass");

            // Create an instance of the DynamicClass
            Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();

            // Get the displayMessage method
            Method displayMessageMethod = dynamicClass.getDeclaredMethod("displayMessage");

            // Invoke the displayMessage method on the dynamicObject
            displayMessageMethod.invoke(dynamicObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
