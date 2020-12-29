

public class Square  extends TwoDimensionalShape
{
    //This declares the variables.
    public float lengthOfSide;

    //This is the constructor.
    Square(float lengthOfSide)
    {
        //This declares the type of shape that is being made.
        super("square");
        //Checks to see if the number is greater than zero.
        if(lengthOfSide > 0.0);
        this.lengthOfSide = lengthOfSide;
    }

    //This calculates the area.
    public float getArea()
    {
        //Area = a^2
        return lengthOfSide * lengthOfSide;
    }

    //This returns length of side.
    private float getLengthOfSide()
    {
        return lengthOfSide;
    }

    ////This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with length of side " + getLengthOfSide();
    }
}
