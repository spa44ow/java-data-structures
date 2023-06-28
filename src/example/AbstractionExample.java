package example;

import example.HelloWorld;
// Abstract class representing a shape
abstract class Shape {
    public abstract void draw(); // Abstract method
}

// Concrete subclass representing a Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw(); // Outputs "Drawing a circle"

        Shape rectangle = new Rectangle();
        rectangle.draw(); // Outputs "Drawing a rectangle"

        String arr = "banana";

        HelloWorld.staticMethod(arr); //static methods can be called without creating an instance of a class

        HelloWorld nonStatic = new HelloWorld(); // AN instance is created

        nonStatic.nonStaticMethod(arr); //needs to create an instance of a class to create a non-static method

    }
}

