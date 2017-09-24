package test;

/**
 * Created by nik on 24/09/17.
 */
public class Test
{
    /*@ ensures \result == x1 || \result == x2 || \result == x3;
      @ ensures \result >= x1 && \result >= x2 && \result >= x3;
     */
    public static int max(int x1, int x2, int x3)
    {
        if(x1 > x2)
        {
            return x1;
        }
        else if(x2 > x3)
        {
            return x2;
        }
        else
        {
            return x3;
        }
    }
}
