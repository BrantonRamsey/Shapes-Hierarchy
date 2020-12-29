//This is the import file for the library to use exponents and square roots.
import static java.lang.Math.*;


public class Triangle  extends TwoDimensionalShape
{
    //This declares the variables.
    public float lengthOfSide;

    //This is the constructor.
    Triangle(float lengthOfSide)
    {
        //This sets the type of shape being made through the super call.
        super("Triangle");
        this.lengthOfSide = lengthOfSide;
    }

    //This calculates the area.
    public float getArea()
    {
        //Area = (h*b/2)
        return (float) sqrt(3)/4 * (lengthOfSide * lengthOfSide);
    }

    //Return length of side.
    private float lengthOfSide()
    {
        return lengthOfSide;
    }


    //This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with length of side " + lengthOfSide();
    }
}
