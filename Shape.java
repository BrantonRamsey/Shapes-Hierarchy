//This is the super class that uses single inheritance to pass down methods and arrays to subclasses.

public abstract class Shape implements CS_3033_Spring_2018
{
    //This is where all of the variables are declared.
    public static final float PI = 3.14f;
    public String type;


    //This is the constructor that passes the variable for type.
    Shape(String type)
    {
        this.type = type;
    }

    //This is the return method for type.
    public String getType()
    {
        return type;
    }


    //These are more variables being declared.
    public abstract float getArea();
    public abstract String draw();


    //This implements the method getStudentUserName and returns the username.
    public String getStudentUserName()
    {
        return "ramsey13";
    }

}
