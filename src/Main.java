package src;

public class Main {

    public static void main(String[] args) {

        Square squareOne = new Square(10, 5);
        Circle circleOne = new Circle(7.8);
        Shapes shape = new Shapes();

        System.out.println(squareOne.calculateArea());
        System.out.println(circleOne.calculateArea());

        shape.addShape(squareOne);
        shape.addShape(circleOne);

        System.out.println(shape.totalArea());




    }
}
