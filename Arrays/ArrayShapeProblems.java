
/**
Solutions to various 2-D array problems.
*/

public class ArrayShapeProblems
{
    // instance variables 
    private int x;

    
    //A method that counts how many positions in the parameter array a are upsteps, and returns that count.
    public int countUpsteps(int[] a) {
        int count=0;
        for (int i=0; i<a.length-1; i++) {
            if (a[i] < a[i+1]) {
                count++;
            }
        }
        return count;
    }

    //A method that checks whether the two parameter arrays a and b (assuming that the arrays have same length) are the same 
    //overall shape in that every position i has the same classification (upstep, downstep or plateau) in both arrays.
    public boolean sameStepShape(int[] a, int[] b) {
        int count=0;
        int i=0;
        while (i<a.length-1 && i<b.length-1){
            if(a[i]== a[i+1] && b[i]==b[i+1]){
                count++;

            }
            else if(a[i]<a[i+1] && b[i]<b[i+1]) {
                count++;

            }
            else if (a[i]>a[i+1] && b[i]>b[i+1]) {
                count++;
            }
            i++;

        }

        if (count==a.length-1){
            return true;
        }
        return false;
    }

    //A method that checks whether the parameter array a has a sawtooth shape, meaning that it has no plateaus, 
    //and that each upstep is immediately followed by a downstep and vice versa. 
    public boolean isSawtooth(int[] a) {
        int tmp=1;
        for (int i=0; i<a.length-1; i++) {
            if (a[i] == a[i+1]){
                return false;
            }
            for (int j=0; j<a.length-2; j++) {

                if (a[j]<a[j+1] && a[j+1]<a[j+2]){
                    return false;
                }
                if (a[j]>a[j+1] && a[j+1]>a[j+2]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    //A method that checks whether the parameter array a is a mountain, meaning that it contains no plateaus, 
    //and that it initially contains zero or more upsteps, which are then followed by zero or more downsteps.
    public boolean isMountain(int[] a) {
        for (int i=0; i<a.length-2; i++) {
            if (a[i] == a[i+1] || (a[i] > a[i+1] && a[i+1]<a[i+2])){
                return false;
            }
        }

        return true;

    }
}
