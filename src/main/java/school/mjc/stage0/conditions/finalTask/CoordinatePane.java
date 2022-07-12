package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
       //

        //find true condition of first quadrant
        if(x>0 && y>0)
            System.out.println("first");

            //find second quadrant
        else if(x<0 && y>0)
            System.out.println("fourth");

            //To find third quadrant
        else if(x<0 && y<0) System.out.println("third");

            //To find Fourth quadrant
        else if (x > 0 && y < 0)
            System.out.println("second");

            //To find dose not lie on origin
        else if (x == 0 && y == 0)
            System.out.println("zero");

            //On x-axis
        else if (y==0 && x!=0)
            System.out.println("x-axis");

            //On y-axis
        else if (x==0 && y!=0)
            System.out.println("y-axis");

    }
}
