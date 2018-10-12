import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        Class myClass = car.getClass();
        // get Class constructors
        System.out.println("===========Constructors==========");
        for (Constructor constructor : myClass.getConstructors()) {
            System.out.println(constructor.toString());
        }
        // get declaration fields
        System.out.println("===========Declaration fields==========");
        for (Field field : myClass.getDeclaredFields()) {
            System.out.println(field.toString());
        }
        // set declaration field
        System.out.println("===========Declaration field name color==========");
        try {
            Field field = myClass.getDeclaredField("color");
            field.setAccessible(true);
            System.out.println(field.getType().toString());
            field.set(car, "two");
            System.out.println(field.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Recursion get method
        System.out.println("==========Methods===========");
        for (Method method : myClass.getMethods()) {
            System.out.println(method.toString());
        }
    }
}
