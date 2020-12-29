


public abstract class ThreeDimensionalShape  extends Shape
{

    //This declares the variables being used.
    public abstract float getVolume();
    public abstract float getArea();

    //This is the constructor that sets the super so that you can later pass the type of shape being made.
    ThreeDimensionalShape(String s)
    {
        super(s);
    }

}
