package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double side1, double side2, double side3) {

        if((side1 + side2  >  side3) &&
                (side2 + side3 > side1) &&
                (side1 + side3 > side2)) {
            System.out.println("this is a valid triangle");
        }	else 	{
            System.out.println("it's not a triangle");
        }
    }
}
