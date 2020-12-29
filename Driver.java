

public class Driver
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(2);
        shapes[2] = new Triangle(2);
        shapes[3] = new Sphere(2);
        shapes[4] = new Cube(2);
        shapes[5] = new Tetrahedron(2);

        int i = 0;

        for(Shape s : shapes)
        {
            System.out.println("shapes[" + i + "] is a " +  s.draw());
            System.out.println("shapes[" + i + "] has area " + s.getArea());
            if(shapes[i] instanceof ThreeDimensionalShape)
            {
                ThreeDimensionalShape j = (ThreeDimensionalShape) s;
                System.out.println("shapes[" + i + "] has volume: " + j.getVolume());
            }

            i++;

        }
    }
}
