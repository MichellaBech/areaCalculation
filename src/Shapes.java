package src;

import java.util.LinkedList;

public class Shapes {
    private LinkedList<Shape> listOfShapes = new LinkedList<>();

    public void addShape (Shape s)
    {
        listOfShapes.add(s);
    }

    public double totalArea()
    {
        double sum = 0;
        for (int i = 0; i < listOfShapes.size(); i++)
        {
            sum  += listOfShapes.get(i).calculateArea();
        }
        return sum;
    }
}
