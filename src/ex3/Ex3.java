package ex3;

/**
 * Created by nik on 23/09/17.
 */
public class Ex3
{
//    public static void main(String[] args)
//    {
//        System.out.println(sumSquaredFrom1To(10));
//        System.out.println(sumSquaredFrom1To(5));
//    }

    /*@ requires n >= 0;
      @ ensures \result == (\sum int j; j >= 0 && j <= n; j* j);
     */
    public static int sumSquaredFrom1To(int n)
    {
        int sum = 0;

        //@ maintaining sum == (\sum int j; j >= 0 && j >= n; j * j);
        //@ decreasing n - i;
        for(int i = 0; i <= n; i++)
        {
            sum += (i * i);
        }

        return sum;
    }
}
