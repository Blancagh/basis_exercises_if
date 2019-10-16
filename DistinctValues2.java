import java.util.Scanner;
public class DistinctValues2 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = 2;
        
        int y = 2;

        int z = 5;

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else if ((x != y) && (x != z) && (z == y))
        {
            System.out.println("Two numbers differents");
        }
        else if ((x == y) && (x != z) && (z != y)){
            System.out.println("Two numbers differents");
        }
        else if ((x != y) && (x != z) && (z != y)){

            System.out.println("Three numbers differents");
        }
        else if ((y != x) && (x == z) && (y != z)){
            
            System.out.println("Two numbers differents");
        }
    }
}