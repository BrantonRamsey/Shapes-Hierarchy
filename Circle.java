

public class Circle extends TwoDimensionalShape
{
    //Declared variables.
    public float radius;

    //This is the constructor.
    Circle(float radius)
    {
        //This is where the super sets the name of the shape being made.
        super("Circle");
        //Checks to see if the number passed is greater than zero.
        if(radius > 0.0)
        this.radius = radius;
    }

    //This is the method that calculates the area.
    public float getArea()
    {
        //Area = (3.14)a^2
        return PI * (radius * radius);
    }

    //This returns the radius.
    private float getRadius()
    {
        return radius;
    }

    //This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with radius " + getRadius();
    }
}
