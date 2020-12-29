import static java.lang.Math.*;

public class Cube extends ThreeDimensionalShape
{
    //This declares the variables.
    public float lengthOfSide;

    //This is the constructor.
    Cube(float lengthOfSide)
    {
        //This declares the shape being made through the super.
        super("Cube");
        //Checks to see if the number is greater than zero.
        if(lengthOfSide > 0.0);
        this.lengthOfSide = lengthOfSide;
    }

    //This returns the length of side.
    public float getLengthOfSide()
    {
        return lengthOfSide;
    }

    //This calculates the area.
    public float getArea()
    {
        return 6 * (lengthOfSide * lengthOfSide);
    }

    //This calculates the volume.
    public float getVolume()
    {
        //Volume = a^3
        return (float) pow(getLengthOfSide(), 3);
    }

    //This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with length of side  " + getLengthOfSide();
    }

}
