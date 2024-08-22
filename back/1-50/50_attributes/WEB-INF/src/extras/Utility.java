package extras;

public class Utility {
    public static int factorial(int inp) {
        if(inp == 0)
            return 1;
        else
            return inp * factorial(inp-1);
    }   
}
