import java.util.Random;

public class PolyEx1 {
    
    public static void main(String args[]){
        Point v = new Point(3,4);
        Point w = new Point(5,6);
        LabPoint x = new LabPoint(10,20,"x");

        // System.out.println(v);
        // System.out.println(w);
        // System.out.println(x);

        //Idea 1: u references x, and x is a lab point
        Random rand = new Random();
        Point u;
        if(rand.nextBoolean())
            u = x;
        else
            u=w;

        //POLYMORPHISM
        System.out.println(u); //right here, at runtime, 
                                //the "right" toString is called

        //u.setLabel("B"); // u is considered a point

        /*
        LabPoint y = w; //implicit cast that fails

        y.setLabel("C");
        */
    }
}
