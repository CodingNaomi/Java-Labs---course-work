
/**
Solutions to various array problems.
 */

public class ArrayProblems
{
    //A method that creates and returns an array that contains the elements 
    //from the even-numbered positions of the array a, that is, the elements a[0], a[2], a[4],...
    public int [] everyOther(int[] a){
        int[] b = new int[a.length/2+a.length % 2];
        
        for (int i = 0; i < a.length; i=i+2) {
            {

                b[i/2]=a[i];

            }
        }
        return b;
    }

    //A method that counts how many inversions exist inside the array a. 
    //An inversion is a pair of indices (i, j) to the array so that i < j and a[i] > a[j].
    public int countInversions(int[] a){
        int sum = 0;
        for (int i=0; i< a.length-1; i++){
            for (int j=1; j < a.length; j++){
                if (i<j && a[i]>a[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    //A method that modifies the contents of its parameter array a by moving all its nonzero elements 
    //to the left as far as it can, writing over the zero elements that precede them
    public void squeezeLeft(int[] a){
        int [] sqleft = new int [a.length];
        int count=0;
        int loc=0;
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                sqleft[loc++]=a[i];

            }
        }
        for (int j=0; j<a.length; j++){
            a[j]=sqleft[j];
        }
    }

    //A method that takes an array that consists of a series of element values followed by the lengths of the run of those elements, listed in alternating locations. 
    //This method creates and returns a new array that contains these elements, each element repeated the number of times given by its run length.
    public int[] runDecode (int[] a) {
        int lenofa=0;

        for (int i=0; i<a.length; i=i+2) {
            lenofa += a[i];
        }
        int[] b = new int[lenofa];
        int noftimes=0;
        int loc=0;
        for (int j=0; j<a.length; j=j+2) {
            noftimes=a[j];
            for (int k=1; k<=noftimes; k++){
                b[loc++]=a[j+1];
            }
        }
        return b;
    }

}

