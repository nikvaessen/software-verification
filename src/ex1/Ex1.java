package ex1;

import java.util.Arrays;

/**
 * Created by nik on 23/09/17.
 */
public class Ex1
{
    public static void main(String[] args)
    {
        int[] notSorted = new int[] {1,2,3,2,5};

        int[] sorted1 = new int[] {1,2,3,4,5};
        int[] sorted2 = new int[] {4,5,6,7,8};

        System.out.println(isSorted(notSorted));
        System.out.println(isSorted(sorted1));
        System.out.println(isSorted(sorted2));

        System.out.println(Arrays.toString(mergeSorted(sorted1, sorted2)));
    }


    public static boolean isSorted(int[] a)
    {
        for(int i = 0; i < a.length - 2;)
        {
           if(a[i] > a[++i])
           {
               return false;
           }
        }

        return true;
    }

    public static int[] mergeSorted(int[] a1, int[] a2)
    {
        int[] sorted = new int[a1.length + a2.length];

        int idx1 = 0;
        int idx2 = 0;

        for(int i = 0; i < sorted.length; i++)
        {
            if(idx1 >= a1.length)
            {
                sorted[i] = a2[idx2];
                idx2++;
                continue;
            }
            if(idx2 >= a2.length)
            {
                sorted[i] = a1[idx1];
                idx1++;
                continue;
            }

            int a = a1[idx1];
            int b = a2[idx2];

            if(a < b)
            {
                sorted[i] = a;
                idx1++;
            }
            else
            {
                sorted[i] = b;
                idx2++;
            }
        }

        return sorted;
    }
}
