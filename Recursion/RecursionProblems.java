import java.util.*;

/**
 * Solutions to various RecursionProblems.
 * 
 */

public class RecursionProblems
{
    //A method that checks if all elements in the subarray of a from start to end, inclusive, are equal
    public boolean allEqual(int[] a, int start, int end) {
        if(start>=end){return true;}
        int mid = (start+end)/2;
        boolean mleft = allEqual(a, start, mid);
        boolean mright = allEqual(a, mid+1, end);
        return (mleft && mright && a[start]==a[end]) ? true : false;
    }

    //A method that copies len elements from the location start of array src to the location start2 of array tgt. (I
    public void arraycopy(double[] src, int start, double [] tgt, int start2, int len) {
        if (len<1) {return;}
        if (len>=1) {
            tgt[start2] = src[start];
        }
        arraycopy(src, start+1, tgt, start2+1, len-1);

    }

    //A method that checks if the unsorted array a contains the element x anywhere in the subarray from start and end, inclusive.
    public boolean linearSearch(int[] a, int x, int start, int end) {
        if (start>end){return false;}
        if (a[start]==x) {return true;}
       return linearSearch(a, x, start+1, end);
        
    }

    //A method that reverses the order of the elements in the subarray of a from index start to end, inclusive.
    public void reverse(int[] a, int start, int end) {
        if (start>=end) {return;}
        int tmp = a[start];
        a[start] = a[end];
        a[end]=tmp;
        reverse(a, start+1, end-1);
        
    }
}
