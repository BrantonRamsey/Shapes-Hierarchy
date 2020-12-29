

public class Sphere  extends ThreeDimensionalShape
{
    //This declares the variables.
    public float radius;

    //This is the constructor.
    Sphere(float radius)
    {
        //This is the super that declares the shape being made.
        super("Sphere");
        //This checks to see if the number is greater than zero.
        if(radius > 0.0);
        this.radius = radius;
    }

    //This returns the radius.
    private float getRadius()
    {
        return radius;
    }

    //This calculates the area.
    public float getArea()
    {
        return 4 * PI *(radius * radius);
    }

    //This calculates the volume.
    public float getVolume()
    {
        //Volume = (4/3)3.14^3
        return (4/3) * PI * (radius * radius * radius);
    }

    ////This overrides the method in the class above and it returns the shape name and parameters through the draw method.
    @Override
    public String draw()
    {
        return getType() + " with radius " + getRadius();
    }
}
