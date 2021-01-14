
/**

Solutions to various problems involving loops.
 */

public class LoopProblems
{
    //instance variables 
    private int n;

    //A method that calculates and returns the factorial of the parameter n.
    public long factorial (int n)
    {
        // initialise instance variables
        long result = 1;
        int i;

        for (i=2; i<=n; i++){
            result = result*i;

        }
        return result;

    }

    //A method that counts how many digits there are in the integer parameter n 
    //when written out in the everyday base 10
    public int countDigits(int n){
        int sum=0;
        if (n<0){
            return countDigits(-n);
        }
        while (n>0){
            sum++;
            n = n/10;
        }
        return sum;
    }

    //A method that counts how many times the digit d appears in total in the integers from start to end, inclusive.
    public int countDigitOccurrences(int d, int start, int end){
        int sum=0;
        int j;
        for(int i = start; i <= end; i++){
            j = Math.abs(i);
            if(i == 0 && d == 0) { sum++; }
            else {
                do {

                    if (d==j%10){
                        sum++;

                    }
                    j = j /10;
                }while (j != 0);
            }
        }
        return sum;
    }

    //A method that checks whether its parameter a is self-divisible.
    public boolean isSelfDivisible(int a){
        int result=0;
        int j;
        j = Math.abs(a);
        do {
            result = result + j%10;
            j=j/10;
        } while (j>0);

        if (a%result==0){
            return true;
        }

        return false;

    }
}

