package ex4;

import ex1.Ex1;

import java.util.Arrays;

/**
 * Created by nik on 23/09/17.
 */
public class Ex4
{
    public static void main(String[] args)
    {
        int[] toSort = new int[] {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(toSort));

        int[] sorted = bubbleSort(toSort);
        System.out.println(Arrays.toString(sorted));
        System.out.println(Ex1.isSorted(sorted));
    }

    public static int[] bubbleSort(int[] toSort)
    {
        int[] copy = Arrays.copyOf(toSort, toSort.length);

        int switches;
        int a, b;
        do
        {
            switches = 0;
            for(int i = 0; i < copy.length - 1; i++)
            {
                a = copy[i];
                b = copy[i + 1];
                if(a > b)
                {
                    switches++;
                    copy[i] = b;
                    copy[i + 1] = a;
                }
            }
        }
        while(switches > 0);

        return copy;
    }

//    public static int[] heapSort(int[] toSort)
//    {
//
//    }
}
