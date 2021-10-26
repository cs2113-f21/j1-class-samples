import java.util.Random;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Random   rand = new Random(System.currentTimeMillis());
    Point    v    = new Point(3, 4);
    LabPoint w    = new LabPoint(5, 2, "A");
    String x = "I'm a string";
    Scanner y = new Scanner(System.in);

    //everything is an object, so I can reference to point any Object
    Object o = null; 

    int i = rand.nextInt(5);
    switch(i){
        case 0: o=v; break;
        case 1: o=w; break;
        case 2: o=x; break;
        case 3: o=y; break;
        case 4: o=new Object();
    }

    System.out.println(o.toString());
  }
}