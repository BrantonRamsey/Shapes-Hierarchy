//This imports the math library to use square root and exponents.
import static java.lang.Math.*;

public class Tetrahedron extends ThreeDimensionalShape
{
    //This declares the variables.
    public float lengthOfSide;

    //This is the constructor.
    Tetrahedron(float lengthOfSide)
    {
        //This is the super that declares the shape being made.
        super("Tetrahedron");
        //Checks to see if the number is greater than zero.
        if(lengthOfSide > 0.0);
        this.lengthOfSide = lengthOfSide;
    }

    //Returns length of side.
    private float getLengthOfSide()
    {
        return lengthOfSide;
    }

    //Calculates the area.
    public float getArea()
    {
        return (float) sqrt(3) * lengthOfSide * lengthOfSide;
    }

    //Calculates the volume.
    public float getVolume()
    {
        //Volume = (a^3/(6 square (2))
        return (lengthOfSide * lengthOfSide) / (float) sqrt(3);
    }

    ////This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with length of side " + getLengthOfSide();
    }
}
